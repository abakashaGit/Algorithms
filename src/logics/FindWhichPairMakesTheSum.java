package logics;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindWhichPairMakesTheSum {
	
	public static void main(String[] args) {
		int[] inputArray = new int[] {1,1,15,5,2,4,9,0,6};
		int targetSum = 9;
		findPair(inputArray,targetSum);
	}

	private static void findPair(int[] inputArray, int targetSum) {
		HashMap<Integer, Integer> mappingPairs = new HashMap<>();
		HashMap<Integer, Integer> mappingReverse = new HashMap<>();
		
		for(int i = 0; i<inputArray.length;i++) {
			if(inputArray[i] <= targetSum) {
				if(mappingPairs.containsValue(inputArray[i])) {
					
					System.out.println("the pairs are at index "+mappingReverse.get(inputArray[i])+" and "+i);
					
				}else{
					mappingPairs.put(i, targetSum - inputArray[i]);
					mappingReverse.put(targetSum - inputArray[i], i);
				}
			}
		}
	}

}
