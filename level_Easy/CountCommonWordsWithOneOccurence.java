package level_Easy;

import java.util.HashMap;
import java.util.Map;

public class CountCommonWordsWithOneOccurence {
	public int countWords(String[] words1, String[] words2) {
		int c = 0;
		Map<String, Integer> s1 = new HashMap<>();
		Map<String, Integer> s2 = new HashMap<>();
		for (String s : words1)
			s1.put(s, s1.getOrDefault(s, 0) + 1);
		for (String s : words2)
			s2.put(s, s2.getOrDefault(s, 0) + 1);
		for (Map.Entry<String, Integer> x : s1.entrySet()) {
			if (x.getValue() == 1)
				for (Map.Entry<String, Integer> y : s2.entrySet()) {
					if (y.getValue() == 1) {
						if (x.getKey().equals(y.getKey()))
							c++;
					}
				}
		}
		return c;
	}
}
