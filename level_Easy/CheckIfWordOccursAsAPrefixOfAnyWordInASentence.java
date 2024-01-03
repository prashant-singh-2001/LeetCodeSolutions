package level_Easy;

public class CheckIfWordOccursAsAPrefixOfAnyWordInASentence {
	public int isPrefixOfWord(String sentence, String searchWord) {
		String[] s = sentence.split(" ");
		int len = searchWord.length();
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() >= len && s[i].substring(0, len).equals(searchWord))
				return i + 1;
		}
		return -1;
	}
}
