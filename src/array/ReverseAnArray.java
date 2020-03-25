package array;

public class ReverseAnArray {
	
	public static void main(String[] args) {
		
		int [] reversed = reverseTheArray(new int[] {1,2});
		for(int a:reversed)
		System.out.println(a);
	}
	
	// The brute forece approach
	private static int[] reverseTheArray( int[] inputArray) {
		
		for(int i = 0; i < inputArray.length/2; i++) {
			int last = inputArray[inputArray.length - i - 1];
			int first = inputArray[i];
			inputArray[i] = last;
			inputArray[inputArray.length - i - 1] = first;
		}
		return inputArray;
	}

}
