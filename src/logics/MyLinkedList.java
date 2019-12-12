package logics;

public class MyLinkedList {

	ListNode head;

	static class ListNode {
		int val;
		ListNode next;

		// Constructor
		ListNode(int x) {
			val = x;
		}
	}

	public static MyLinkedList insertToEnd(MyLinkedList list, int val) {

		ListNode newNode = new ListNode(val);
		newNode.next = null;

		// If the LinkedList is empty the add the node at the head position
		if (list.head == null) {
			list.head = newNode;
		} else {
			// traverse till the last node and insert at the end
			ListNode last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}

		return list;
	}

	public static void printAll(MyLinkedList list) {

		ListNode cur = list.head;
		while (cur != null) {
			System.out.println(cur.val);
			cur = cur.next;
		}

	}
}
