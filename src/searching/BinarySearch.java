package searching;

/*
 * Binary search can be applied when the array of items are sorted, 
 * This typically works by repeatedly dividing the interval by half.
 * initially the whole array is taken, then the mid is calculated(lower + upper / 2)
 * then array[mid] if greater than key upper = mid - 1 else lower = mid + 1
 * Worst complexity: O(log n)
	Average complexity: O(log n)
	Best complexity: O(1)
	Space complexity: O(1)
 */
public class BinarySearch {

	static int key = 1;
	static int index;

	public static void main(String[] args) {
		int[] sortedArray = new int[1000000];// This is just to create a bigger sorted array.
		int count = 1;
		for (int i = 0; i < 1000000; i++) {
			sortedArray[i] = count++;
		}
		index = search(sortedArray, key);
		System.out.println("found in " + index + "th position");
	}

	static int search(int[] array, int key) {

		int lower = 0;
		int upper = array.length - 1;

		while (lower <= upper) {
			int mid = (lower + upper) / 2;
			System.out.println("mid in " + mid + "th position");
			if (array[mid] == key) {
				return mid;
			}
			if (key > array[mid]) {
				lower = mid + 1;
			} else {
				upper = mid - 1;
			}
		}
		return -1;
	}

}
