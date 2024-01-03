package level_Easy;

public class MaximumNumberOfWordsYouCanType {
	public int canBeTypedWords(String text, String brokenLetters) {
		int co = 0;
		boolean f = false;
		char c[] = brokenLetters.toCharArray();
		for (String str : text.split(" ")) {
			f = false;
			for (char ch : c) {
				if (str.contains(String.valueOf(ch))) {
					f = true;
					break;
				}
			}
			if (!f)
				co++;
		}
		return co;
	}
}
