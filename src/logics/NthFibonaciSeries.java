package logics;

public class NthFibonaciSeries {
	
	public static void main(String[] args) {
		int n = 5;
		int result = getFibonasiNumber(n);
		System.out.println(n+" th fibonaci series is "+result);
		
	}
	
	private static int getFibonasiNumber(int n) {
		if(n < 1)
			return n;
		int[] a = new int[n+1];
		a[0] = 0;
		a[1] = 1;
		for(int i = 2; i <= n; i++) {
			a[i] = a[i-1]+a[i-2];
		}
		return a[n];
	}

}
