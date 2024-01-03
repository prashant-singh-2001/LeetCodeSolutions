package level_Easy;

public class CountingWordsWithAGivenPrefix {
	public int prefixCount(String[] words, String pref) {
		int count = 0;
		int size = pref.length();
		for (String s : words) {
			if (s.length() >= size && s.substring(0, size).equals(pref))
				count++;
		}
		return count;
	}
}
