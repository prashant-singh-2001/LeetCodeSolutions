package level_Easy;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		int ar1[] = new int[26];
		int ar2[] = new int[26];
		for (char c : s.toCharArray()) {
			ar1[c - 97]++;
		}
		for (char c : t.toCharArray()) {
			ar2[c - 97]++;
		}
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] != ar2[i])
				return false;
		}
		return true;
	}
}
