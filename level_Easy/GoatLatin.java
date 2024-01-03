package level_Easy;

public class GoatLatin {
	public String toGoatLatin(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			char first = word.charAt(0);
			if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'A'
					|| first == 'E' || first == 'I' || first == 'O' || first == 'U') {
				res.append(word);
			} else {
				res.append(word.substring(1));
				res.append(first);
			}
			res.append("ma");
			for (int j = 0; j <= i; j++) {
				res.append("a");
			}
			res.append(" ");
		}
		res.deleteCharAt(res.length() - 1);
		return res.toString();
	}
}
