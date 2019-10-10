package sorting;

public class MergeSort {
	
	private static int[] inputArray = new int[] {45,23,11,22,44,34,33,31,32,21,9};
	public static void main(String[] args) {
		
		int l = 0,
			h=inputArray.length-1;
		mergeSortAlgorithm(l,h);
		
	}
	
	private static void mergeSortAlgorithm( int l, int h) {
		
		if(l < h) {
			int mid = (l+h)/2;
			mergeSortAlgorithm(l,mid);
			mergeSortAlgorithm(mid+1,h);
			merge(l,mid,h);
		}
	}
	
	//low to mid is one list and mid+1 to high is other list
	private static void merge(int low,int mid,int high) {
//		System.out.println("\n first array is \n");
//		for (int i = low; i <=mid; i++) {
//			System.out.print(" "+inputArray[i]);
//		}
//		System.out.println("\n second array is \n");
//		for (int i = mid+1; i <=high; i++) {
//			System.out.print(" "+inputArray[i]);
//		}
		
		int[] newArray = new int[high-low+1];
		int i = low,
			index = 0,
			j = mid+1;
		while(i <= mid && j <= high) {
			if(inputArray[i] < inputArray[j]) {
				newArray[index++] = inputArray[i++];
			}else {
				newArray[index++] = inputArray[j++];
			}
			
		}
		for(;i <= mid;i++ ) {
			newArray[index++] = inputArray[i];
		}
		for(;j <= high; j++ ) {
			newArray[index++] = inputArray[j];
		}
		
		for(int l = 0; l < newArray.length;l++) {
			inputArray[low++] = newArray[l]; 
		}
		
		System.out.println("\n merged array is \n");
		for (int k:inputArray) {
			System.out.print(" "+k);
		}
		
//		System.out.println("\n merged array is \n");
//		for (int k:newArray) {
//			System.out.print(" "+k);
//		}
		
		
		
	}

}
