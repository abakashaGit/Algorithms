package logics;

public class Palindrome_string {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		System.out.println(isPalindrome(""));
		System.out.println(time - System.currentTimeMillis());
	}
	 private static boolean isPalindrome(String s) {
	        if(s.length() <= 1)
	            return true;
	     
	        int i = 0;
	        int j = s.length()-1;
	        
	        while(i <= j){
	       
	            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
	                i++;
	                j--;
	            }else{
	            	if(!Character.isLetterOrDigit(s.charAt(i))){
		                i++;
		                continue;
		            }
		            if(!Character.isLetterOrDigit(s.charAt(j))){
		                j--;
		                continue;
		            }
	                return false;
	            }
	      
	        }
	        return true;
	    }
}
