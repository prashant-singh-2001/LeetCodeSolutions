package level_Easy;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSequence {
	public int findLHS(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int res = 0;
		for (int key : map.keySet()) {
			if (map.containsKey(key + 1)) {
				res = Math.max(res, map.get(key) + map.get(key + 1));
			}
		}
		return res;
	}
}