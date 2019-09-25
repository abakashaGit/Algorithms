package sorting;

public class QuickSort {
	private static int[] inputArray = new int[] {1,1,1,1,1,1,1,1,1};
	
	public static void main(String[] args) {
		sort(0,inputArray.length-1);
		System.out.println(" sorted array is ");
		for(int i:inputArray)
			System.out.print(" "+i);
	}
	
	private static void sort(int lower, int upper) {
		int pivot = inputArray[lower];
		int i = lower;
		int j = inputArray.length - 1;
		while(i <= j) {
			while( pivot > inputArray[i] ) {
				i++;
				System.out.println(" i : "+i);
			}
			while( pivot < inputArray[j] ) {
				j--;
				System.out.println(" j : "+j);
			}
			if(i <= j) {
				swap(i,j);
				i++;
				j--;
			}
		}
		System.out.println(" lower : "+lower+" upper : "+upper+" i: "+i+" j: "+j);
		if (lower < j)
			sort(lower, j);
        if (i < upper)
        	sort(i, upper);
		
	}
	
	private static void swap(int position1,int position2) {
		System.out.println("swap positions : "+position1+" and "+position2);
		int temp = inputArray[position1];
		inputArray[position1] = inputArray[position2];
		inputArray[position2] = temp;
	}

}
