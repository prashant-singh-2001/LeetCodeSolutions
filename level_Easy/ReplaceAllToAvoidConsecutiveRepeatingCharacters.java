package level_Easy;

public class ReplaceAllToAvoidConsecutiveRepeatingCharacters {
	public String modifyString(String s) {
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '?') {
				for (char c = 'a'; c <= 'z'; c++) {
					a[i] = c;
					if (i > 0 && a[i - 1] == c) {
						continue;
					}
					if (i < a.length - 1 && a[i + 1] == c) {
						continue;
					}
					break;
				}
			}
		}

		return new String(a);
	}
}
