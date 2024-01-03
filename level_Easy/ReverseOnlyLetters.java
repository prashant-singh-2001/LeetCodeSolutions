package level_Easy;

public class ReverseOnlyLetters {
	public String reverseOnlyLetters(String s) {
		int s1 = 0, s2 = 0;
		char cr[] = s.toCharArray();
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		char cr2[] = sb.toString().toCharArray();
		while (s1 < s.length() && s2 < s.length()) {
			if (!Character.isAlphabetic(cr[s1])) {
				s1++;
			} else if (!Character.isAlphabetic(cr2[s2])) {
				s2++;
			} else {
				cr[s1] = cr2[s2];
				s1++;
				s2++;
			}
		}
		return new String(cr);
	}
}
