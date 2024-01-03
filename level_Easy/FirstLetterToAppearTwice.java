package level_Easy;

public class FirstLetterToAppearTwice {
	public char repeatedCharacter(String s) {
		int[] ar = new int[26];
		char ch = '!';
		for (char c : s.toCharArray()) {
			if (ar[c - 'a'] == 1) {
				ch = c;
				break;
			}
			ar[c - 'a']++;
		}
		return ch;
	}
}
