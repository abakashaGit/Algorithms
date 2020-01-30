package strings;



public class FirstUniqueCharacter {

	public static void main(String[] args) {

		System.out.println(" The first unique character in the string is : " + firstUniqChar("llooveleetcodetdcv"));
	}

	private static int firstUniqChar(String s) {
		return 0;
	}
	
	
	//-----------------PASSED BUT NOT EFFICIENT-------------
	// works fine with complexity O(n) but its too slow takes 124 ms to execute and takes lot of space.
//	private static int firstUniqChar(String s) {
//		if (s == null || s.length() == 0)
//			return -1;
//		LinkedList<Character> listChar = new LinkedList<>();
//		List<Character> deletedCharList = new ArrayList<Character>();
//		
//		for (char c : s.toCharArray()) {
//			if (listChar.contains(c)) {
//				listChar.remove(listChar.indexOf(c));
//				deletedCharList.add(c);
//			} else if(!deletedCharList.contains(c)){
//				listChar.add(c);
//			}
//		}
//		System.out.println("the peek is "+ listChar.peek());
//		return listChar.peek() == null ? -1 : s.indexOf(listChar.peek());
//	}

	//--------------FAILED---------
	// First fialed attemp the PriorityQueue is not same as the normal Queue.
	// private static int firstUniqChar(String s) { // 
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
