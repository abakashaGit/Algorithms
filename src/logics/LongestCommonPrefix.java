package logics;

import java.util.HashSet;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strings = new String[] { "flower", "flow", "flight" };
		if (strings.length == 0)
		{
		//	return "";
		}
		String resultLcp = strings[0];
		for (int i = 1; i < strings.length; i++) {
			resultLcp = lcp(resultLcp, strings[i]);
		}

		System.out.println("The Longest common prefix is " + resultLcp);
	}

	static String lcp(String s1, String s2) {
		String prefix = s1;
		while (s2.indexOf(prefix) != 0) {
			prefix = prefix.substring(0, prefix.length() - 1);
			if (prefix.isEmpty())
				return "";
		}
		return prefix;
	}
}
