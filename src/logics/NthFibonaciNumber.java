package logics;

public class NthFibonaciNumber {

	private static int count = 0;
	public static void main(String[] args) {
		int[] array= new int[6];
		for(int i = 0;i < array.length; i++)
			array[i] = -1;
		
		int num = getNthFibonaciSeries(array,5);
		System.out.println("the number is "+num);
		System.out.println("executed "+count);
	}
	
	//the lazy process with complexity (2 pow n)
//	private static int getNthFibonaciSeries(int n) {
//		count++;
//		if(n <= 1) {
//			return n;
//		}
//		return getNthFibonaciSeries(n-2)+getNthFibonaciSeries(n-1);
//	}
	
	//memoisation method
	private static int getNthFibonaciSeries(int[] storedArray,int n) {
		if(storedArray[n] != -1) {
			return storedArray[n];
		}
		count++;
		if(n <= 1) {
			return n;
		}
		storedArray[n] = getNthFibonaciSeries(storedArray,n-2)+getNthFibonaciSeries(storedArray,n-1);
		return storedArray[n];
	}
	
	
}
