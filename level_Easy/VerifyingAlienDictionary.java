package level_Easy;

public class VerifyingAlienDictionary {
	public boolean isAlienSorted(String[] words, String order) {
		int[] index = new int[26];
		for (int i = 0; i < order.length(); i++) {
			index[order.charAt(i) - 'a'] = i;
		}
		for (int i = 0; i < words.length - 1; i++) {
			String word1 = words[i];
			String word2 = words[i + 1];
			int length = Math.min(word1.length(), word2.length());
			for (int j = 0; j < length; j++) {
				if (word1.charAt(j) != word2.charAt(j)) {
					if (index[word1.charAt(j) - 'a'] > index[word2.charAt(j) - 'a']) {
						return false;
					}
					break;
				}
			}
			if (word1.length() > word2.length() && word1.startsWith(word2)) {
				return false;
			}
		}
		return true;
	}
}
