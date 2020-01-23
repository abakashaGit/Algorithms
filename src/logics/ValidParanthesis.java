package logics;

import java.util.HashMap;
import java.util.Stack;

public class ValidParanthesis {
	
	public static void main(String[] args) {
		
		System.out.println(isValid("[(){}]"));
	}
	//3rd Solution which took 2 ms time.
	static boolean isValid(String s) {
      if(s == null || s.length() == 0)
			return true;
		Stack<Character> stackOfParanthesis = new Stack<>();
		HashMap<Character, Character> mapParanthesis = new HashMap<>();
		mapParanthesis.put('(', ')');
		mapParanthesis.put('[', ']');
		mapParanthesis.put('{', '}');
		
		for(char c:s.toCharArray()) {
			if(mapParanthesis.containsKey(c)) {
				stackOfParanthesis.push(c);
			}else {
				if(stackOfParanthesis.isEmpty())
					return false;
				else {
					if(c == mapParanthesis.get(stackOfParanthesis.peek())) {
						stackOfParanthesis.pop();
					}else {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	// Reducing switch cases and number of cases time reduced to 3ms
//	static boolean isValid(String s) {
//        if(s == null || s.length() == 0)
//			return true;
//		Stack<Character> stackOfParanthesis = new Stack<>();
//		
//		int i = 0;
//		while(i < s.length()) {
//            
//            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
//                stackOfParanthesis.push(s.charAt(i));
//            }else{
//                if(stackOfParanthesis.isEmpty())
//					return false;
//                if(s.charAt(i) == ')'){
//                   if(stackOfParanthesis.peek() == '('){
//                    stackOfParanthesis.pop();   
//                   }else{
//                       return false;
//                   }
//                }else if(s.charAt(i) == ']'){
//                    if(stackOfParanthesis.peek() == '[')
//                        stackOfParanthesis.pop();   
//                  else
//                       return false;
//                }else{
//                    if(stackOfParanthesis.peek() == '{')
//                        stackOfParanthesis.pop();   
//                  else
//                       return false;
//                }         
//            }
//
//			i++;
//		}
//		
//		return stackOfParanthesis.isEmpty();
//	}

	//First Solution which took 7 ms time 
	//	static boolean isValid(String s) {
//		
//		if(s == null || s.length() == 0)
//			return true;
//		Stack<Character> stackOfParanthesis = new Stack<>();
//		
//		int i = 0;
//		while(i < s.length()) {
//			switch (s.charAt(i)) {
//			case '(':
//				stackOfParanthesis.push('(');
//				break;
//			case '{':
//				stackOfParanthesis.push('{');
//				break;
//			case '[':
//				stackOfParanthesis.push('[');
//				break;
//			case ')':
//				if(stackOfParanthesis.isEmpty())
//					return false;
//				if(stackOfParanthesis.peek() == '(')
//					stackOfParanthesis.pop();
//				else
//					return false;
//				break;
//			case '}':
//				if(stackOfParanthesis.isEmpty())
//					return false;
//				if(stackOfParanthesis.peek() == '{')
//					stackOfParanthesis.pop();
//				else
//					return false;
//				break;
//			case ']':
//				if(stackOfParanthesis.isEmpty())
//					return false;
//				if(stackOfParanthesis.peek() == '[')
//					stackOfParanthesis.pop();
//				else
//					return false;
//				break;
//
//			default:
//				break;
//			}
//			i++;
//		}
//		
//		if(stackOfParanthesis.isEmpty())
//			return true;
//		else
//			return false;
//	}
}
