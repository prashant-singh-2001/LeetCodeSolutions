package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
	public static List<String> commonChars(String[] words) {
		int[] commonCount = new int[26];
		for (char c : words[0].toCharArray()) {
			commonCount[c - 'a']++;
		}

		for (int i = 1; i < words.length; i++) {
			int[] wordCount = new int[26];
			for (char c : words[i].toCharArray()) {
				wordCount[c - 'a']++;
			}
			for (int j = 0; j < 26; j++) {
				commonCount[j] = Math.min(commonCount[j], wordCount[j]);
			}
		}

		List<String> result = new ArrayList<>();
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < commonCount[i]; j++) {
				result.add(String.valueOf((char) ('a' + i)));
			}
		}

		return result;
	}
}
