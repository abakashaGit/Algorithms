package logics;

import java.util.ArrayList;

/*
 * This is to find out the extra perfect number between 1 to N, and print the result in an array.
 * Extra perfect number is the numbers where the first and last are set bits.
 * set bits are the '1's present in the binary representation.
 */
public class ExtraPerfectNumber {

	public static void main(String[] args) {
		extraPerfect(8);
	}

	private static int[] extraPerfect(int number) {
		ArrayList<Integer> listOfExtraPerfectNumers = new ArrayList<>();

		for (int i = 1; i <= number; i++) {
			String bits = Integer.toBinaryString(i);
			if (bits.charAt(0) == '1' && bits.charAt(bits.length() - 1) == '1') {
				listOfExtraPerfectNumers.add(i);
			}
		}

		int[] returnArray = new int[listOfExtraPerfectNumers.size()];
		for (int j = 0; j <= listOfExtraPerfectNumers.size() - 1; j++) {
			returnArray[j] = listOfExtraPerfectNumers.get(j);
		}
		return returnArray; // Do your magic!
	}


}
