package level_Easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountItemsMatchingARule {
	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		Map<String, Integer> hs = new HashMap<>();
		hs.put("type", 0);
		hs.put("color", 1);
		hs.put("name", 2);
		int count = 0;
		for (List<String> ls : items) {
			if (ls.get(hs.get(ruleKey)).equals(ruleValue)) {
				count++;
			}
		}
		return count;
	}
}
