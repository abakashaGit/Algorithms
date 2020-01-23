package logics;

public class Palindrome {
	
	public static void main(String[] args) {
	
		int number = 121211, rev = 0;
		
		while(number > rev) {
			System.out.println("inside loop");
			rev = rev * 10 + number % 10;
			number = number /10;
		}
		
		if(rev == number || rev / 10 == number) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	
	

}
