package level_Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurences {
	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> oc = new HashMap<>();
		for (int i : arr)
			oc.put(i, oc.getOrDefault(i, 0) + 1);
		Set<Integer> occurrenceSet = new HashSet<>();

		for (int count : oc.values()) {
			if (occurrenceSet.contains(count)) {
				return false;
			}
			occurrenceSet.add(count);
		}
		return true;
	}
}
