package level_Easy;

public class FirstOccurenceOfString {
	public int strStr(String haystack, String needle) {
		if (haystack.length() < needle.length())
			return -1;
		if (haystack.equals(needle))
			return 0;
		int n = haystack.length(), m = needle.length();
		for (int i = 0; i < n - m + 1; i++) {
			if (haystack.substring(i, i + m).equals(needle))
				return i;
		}
		return -1;
	}
}
