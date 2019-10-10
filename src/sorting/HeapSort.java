package sorting;

public class HeapSort {

	private static int[] heapifiedArray;

	public static void main(String[] args) {
		int[] array = new int[] { 10, 20, 15, 30, 40,55,5,75 };
		heapifiedArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			System.out.println("-------------------------");
			heapify(array[i], i);
		}

		System.out.println("heapified array is ");
		for (int i : heapifiedArray) {
			System.out.println(i);
		}
		// sorting the array
		for(int i=0;i < heapifiedArray.length;i++) {
			swap(0, heapifiedArray.length-i+1);
		}

	}
	
	static void heapifyRoot() {
		
	}

	static void heapify(int inputNode, int position) {

		System.out.println("inserting " + inputNode + " in position " + position);

		heapifiedArray[position] = inputNode;
		if (position == 0) {
			return;
		}
		int root;
		if (position % 2 == 0) {
			root = (position / 2) - 1;
		} else {
			root = (position / 2);
		}

		System.out.println("root is at " + root);

		while (root >= 0) {
			if (heapifiedArray[root] < heapifiedArray[position]) {
				System.out.println("swap of " + heapifiedArray[root] + " and " + heapifiedArray[position]);
				swap(root, position);
				if (root == 0) {
					break;
				}
				if (root > 0) {
					position = root;
					if (root % 2 == 0) {
						root = (root / 2) - 1;
					} else {
						root = (root / 2);
					}
					System.out.println("root is at " + root + " position is at " + position);
				}
				System.out.println("root is at after condition" + root);
			}else {
				break;
			}
		}
		System.out.println("while loop completed");
		for (int i : heapifiedArray) {
			System.out.println(" "+i);
		}

	}

	static void swap(int pos1, int pos2) {
		int temp = heapifiedArray[pos1];
		heapifiedArray[pos1] = heapifiedArray[pos2];
		heapifiedArray[pos2] = temp;

	}

}
