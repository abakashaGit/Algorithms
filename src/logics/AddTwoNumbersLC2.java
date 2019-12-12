package logics;


public class AddTwoNumbersLC2 extends MyLinkedList{
	
	private static MyLinkedList linkedList;
	private static MyLinkedList linkedList2;
	
	public static void main(String[] args) {
		initializeList();
		//printAll(linkedList);
		System.out.println("second list is ");
		printAll(linkedList2);
	}

	private static void initializeList() {
		 /* Start with the empty list. */
		linkedList = new MyLinkedList(); 
		linkedList2 = new MyLinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
//		linkedList = insertToEnd(linkedList, 1); 
//		linkedList = insertToEnd(linkedList, 2); 
//		linkedList = insertToEnd(linkedList, 3); 
//		linkedList = insertToEnd(linkedList, 1); 
//		linkedList = insertToEnd(linkedList, 2); 
//		linkedList = insertToEnd(linkedList, 3); 
		
		linkedList2 = insertToEnd(linkedList2, 4); 
		linkedList2 = insertToEnd(linkedList2, 5);
		linkedList2 = insertToEnd(linkedList2, 6);
        
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		StringBuilder sb = new StringBuilder();
		while(l1.next != null) {
			
		}
		
		return l2;

	}

}
