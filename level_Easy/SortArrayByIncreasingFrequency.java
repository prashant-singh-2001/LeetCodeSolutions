package level_Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortArrayByIncreasingFrequency {
	public int[] frequencySort(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> ans = new ArrayList<>();
		for (int n : nums) {
			ans.add(n);
			map.put(n, map.getOrDefault(n, 0) + 1);
		}

		Collections.sort(ans, (a, b) -> (map.get(a) == map.get(b)) ? b - a : map.get(a) - map.get(b));

		return ans.stream().mapToInt(i -> i).toArray();
	}
}
