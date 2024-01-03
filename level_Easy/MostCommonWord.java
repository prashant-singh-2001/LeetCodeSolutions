package level_Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {
		Set<String> ban = new HashSet<>(Arrays.asList(banned));
		Map<String, Integer> count = new HashMap<>();
		StringBuilder word = new StringBuilder();
		int maxCount = 0;
		String result = "";
		paragraph = paragraph.toLowerCase();
		for (int i = 0; i < paragraph.length(); i++) {
			char c = paragraph.charAt(i);
			if (Character.isLetter(c)) {
				word.append(c);
				if (i == paragraph.length() - 1 || !Character.isLetter(paragraph.charAt(i + 1))) {
					String w = word.toString();
					if (!ban.contains(w)) {
						count.put(w, count.getOrDefault(w, 0) + 1);
						if (count.get(w) > maxCount) {
							maxCount = count.get(w);
							result = w;
						}
					}
					word.setLength(0);
				}
			}
		}
		return result;
	}
}
