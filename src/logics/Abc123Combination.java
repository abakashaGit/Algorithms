package logics;

import java.util.HashMap;

public class Abc123Combination {
	
	private static HashMap<String, String> mappedCharacters = new HashMap<>();
	
	public static void main(String[] args) {
		addCombinations();
		printAllCombinations("123");
	}

	private static void printAllCombinations(String input) {
		char[] chars = input.toCharArray();
		String sFirst="";
		for(char r:chars) {
			sFirst = sFirst + mappedCharacters.get(String.valueOf(r));
		}
		System.out.println(sFirst);
		
		
		
	}
	private static void addCombinations() {
		mappedCharacters.put("1", "a");
		mappedCharacters.put("2", "b");
		mappedCharacters.put("3", "c");
		mappedCharacters.put("4", "d");
		mappedCharacters.put("5", "e");
		mappedCharacters.put("6", "f");
		mappedCharacters.put("7", "g");
		mappedCharacters.put("8", "h");
		mappedCharacters.put("9", "i");
		mappedCharacters.put("10", "j");
		mappedCharacters.put("11", "k");
		mappedCharacters.put("12", "l");
		mappedCharacters.put("13", "m");
		mappedCharacters.put("14", "n");
		mappedCharacters.put("15", "o");
		mappedCharacters.put("16", "p");
		mappedCharacters.put("17", "q");
		mappedCharacters.put("18", "r");
		mappedCharacters.put("19", "s");
		mappedCharacters.put("20", "t");
		mappedCharacters.put("21", "u");
		mappedCharacters.put("22", "v");
		mappedCharacters.put("23", "w");
		mappedCharacters.put("24", "x");
		mappedCharacters.put("25", "y");
		mappedCharacters.put("26", "z");
		
	}
//Failed methods

//	String sSecond = "";
//	
//	for (int i = 0; i < input.length() - 2; i = i + 2) {
//		String subNumber = input.substring(i, i + 2);
//		sSecond = sSecond + mappedCharacters.get(subNumber);
//	}
//	
//	String sThird = "";
//	for (int i = 1; i < input.length() - 2; i = i + 2) {
//		String subNumber = input.substring(i, i + 2);
//		sThird = sThird + mappedCharacters.get(subNumber);
//	}
//	
//	if(input.length()/2 != 0) { // odd number of characters
//		sSecond = sSecond + mappedCharacters.get(input.substring(input.length()-1));
//		sThird =  mappedCharacters.get(String.valueOf(input.charAt(0))) + sThird;
//	}else {
//		sThird =  mappedCharacters.get(String.valueOf(input.charAt(0))) + sThird+ mappedCharacters.get(input.substring(input.length()-1));
//	}
//	System.out.println(sSecond);
//	System.out.println(sThird);
}
