package level_Easy;

public class ReverseWordsInAStringIII {
	public String reverseWords(String s) {
		StringBuffer sb = null;
		for (String word : s.split(" ")) {
			if (sb == null)
				sb = new StringBuffer();
			else
				sb.append(" ");
			sb.append(reverseString(word));
		}
		return sb.toString();
	}

	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
}
