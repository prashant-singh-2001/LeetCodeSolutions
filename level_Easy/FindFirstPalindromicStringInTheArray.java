package level_Easy;

public class FindFirstPalindromicStringInTheArray {
	public String firstPalindrome(String[] words) {
		String word = new String();
		for (String s : words) {
			if (pali(s)) {
				word = s;
				break;
			}
		}
		return word;
	}

	public boolean pali(String s) {
		StringBuilder sb = new StringBuilder(s);
		return s.equals(sb.reverse().toString());
	}
}
