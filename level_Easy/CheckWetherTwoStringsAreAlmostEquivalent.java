package level_Easy;

public class CheckWetherTwoStringsAreAlmostEquivalent {
	public boolean checkAlmostEquivalent(String word1, String word2) {
		int[] a1 = new int[26];
		int[] a2 = new int[26];
		for (char c : word1.toCharArray())
			a1[c - 'a']++;
		for (char c : word2.toCharArray())
			a2[c - 'a']++;
		for (int i = 0; i < 26; i++)
			if (Math.abs(a1[i] - a2[i]) > 3)
				return false;
		return true;
	}
}
