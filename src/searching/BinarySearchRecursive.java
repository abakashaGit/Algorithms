package searching;

public class BinarySearchRecursive {

	static int[] sortedArray;

	public static void main(String[] args) {
		int key = 56;
		sortedArray = new int[10];// This is just to create a bigger sorted array.
		int count = 1;
		for (int i = 0; i < 10; i++) {
			sortedArray[i] = count++;
		}

		searchRecursive(0, sortedArray.length - 1, key);

	}

	static void searchRecursive(int l, int h, int key) {
		
		System.out.println("lower " + l + " higher " + h);
		if( l > h) {
			System.out.println("not found");
			return;
		}
		if (l == h) {
			if (key == sortedArray[l])
				System.out.println("found in " + l + " th position");
			else
				System.out.println("not found");
		}
		int mid = (l + h) / 2;
		if (key == sortedArray[mid]) {
			System.out.println("found in " + mid + "th position");
		} else {
			if (key > sortedArray[mid]) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
			System.out.println("lower " + l + " higher " + h + " mid " + mid);
			searchRecursive(l, h, key);
		}

	}
}
