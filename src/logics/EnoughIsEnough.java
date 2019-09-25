package logics;

import java.util.ArrayList;
import java.util.HashMap;

public class EnoughIsEnough {
	
	public static void main(String[] args) {
		
		System.out.println(deleteNth(new int[] {20,37,20,21}, 1));
		System.out.println(deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3));
	}

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		//Code here ;)
		HashMap<Integer, Integer> mapNumerAndOccurance=new HashMap<>();
		ArrayList<Integer> finalOutPut = new ArrayList<>();
		int sizeOfResultArray=0;
		
		
		for(int element:elements) {
			if(mapNumerAndOccurance.containsKey(element)) {
				if(mapNumerAndOccurance.get(element) < maxOccurrences) {
					mapNumerAndOccurance.put(element, mapNumerAndOccurance.get(element)+1);
					finalOutPut.add(element);
					sizeOfResultArray++;
				}
				
			}else {
				mapNumerAndOccurance.put(element, 1);
				finalOutPut.add(element);
				sizeOfResultArray++;
			}
		}
		int[] resultArray=new int[sizeOfResultArray];
		for(int i=0;i<resultArray.length;i++) {
			resultArray[i]=finalOutPut.get(i);
		}
		return resultArray;
	}
}
