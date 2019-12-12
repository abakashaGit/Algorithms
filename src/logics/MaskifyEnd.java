package logics;

public class MaskifyEnd {

	public static void main(String[] args) {
		String str= "44444";
		System.out.println(str.replaceAll(".(?=.{4})", "#"));
	}
	public static String maskify(String str) {
		if (str.length() <= 4)
			return str;
		int maskifyLength = str.length() - 4;
		StringBuilder sb = new StringBuilder();
		while (maskifyLength > 0) {
			sb.append("#");
			maskifyLength--;
		}
		return sb.toString() + str.substring(str.length() - 4);

	}
}
