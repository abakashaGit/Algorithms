package strings;

import java.util.LinkedList;

public class FirstUniqueCharacter {

	public static void main(String[] args) {

		System.out.println(" The first unique character in the string is : " + firstUniqChar("leetcode"));
	}

	private static int firstUniqChar(String s) {
		if (s == null || s.length() == 0)
			return -1;
		LinkedList<Character> listChar = new LinkedList<>();
		for (char c : s.toCharArray()) {
			if (listChar.contains(c)) {
				listChar.remove(listChar.indexOf(c));
			} else {
				listChar.add(c);
			}
		}

		return listChar.peek() == null ? -1 : s.charAt(listChar.indexOf(listChar.peek()));
	}

	// First fialed attemp the PriorityQueue is not same as the normal Queue.
	// private static int firstUniqChar(String s) {
	// if(s == null || s.length() == 0)
	// return -1;
	// PriorityQueue<Character> queue = new PriorityQueue<Character>();
	// int i = 0;
	// while(i < s.length()) {
	// if(queue.peek() != null && s.charAt(i) == queue.peek()) {
	// queue.remove();
	// }else {
	// queue.add(s.charAt(i));
	// }
	// i++;
	// }
	// return queue.peek() != null ?s.indexOf(queue.peek()) : -1;
	// }

}
