package level_Easy;

public class GreatestEnglishLetterInUpperAndLowerCase {
	public String greatestLetter(String s) {
		int up[] = new int[26];
		int lo[] = new int[26];
		int index = -1;
		for (char c : s.toCharArray()) {
			if (Character.isUpperCase(c))
				up[c - 'A'] = up[c - 'A'] == 0 ? 1 : 1;
			else
				lo[c - 'a'] = lo[c - 'a'] == 0 ? 1 : 1;
		}
		for (int i = 0; i < 26; i++) {
			if (up[i] + lo[i] > 1) {
				index = i;
			}
		}
		if (index != -1)
			s = String.valueOf((char) (index + 'A'));
		else
			return "";
		return s;
	}
}
