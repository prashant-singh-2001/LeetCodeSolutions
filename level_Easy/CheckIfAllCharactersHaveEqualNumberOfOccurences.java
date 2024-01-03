package level_Easy;

public class CheckIfAllCharactersHaveEqualNumberOfOccurences {
	public boolean areOccurrencesEqual(String s) {
		int[] ar = new int[26];
		for (char c : s.toCharArray()) {
			ar[c - 'a']++;
		}
		int a = ar[s.charAt(0) - 'a'];
		for (int i = 0; i < 26; i++) {
			if (ar[i] == 0 || ar[i] == a)
				continue;
			else
				return false;
		}
		return true;
	}
}
