package logics;

import java.util.LinkedList;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println(reverse(96424351));
		
	}

	private static int reverse(int x) {
		
		int rev = 0;
		while (x > 0) {
			int r = x % 10;
			x = x / 10;
			if(rev > Integer.MAX_VALUE || (rev == Integer.MAX_VALUE/10 && r > 7))
					return 0;
			if(rev < Integer.MIN_VALUE || (rev == Integer.MIN_VALUE/10 && r < -8))
					return 0;
			rev = rev*10+r;
		}
		return rev;
	}
}
