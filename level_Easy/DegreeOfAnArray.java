package level_Easy;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {
	public int findShortestSubArray(int[] nums) {
		Map<Integer, Integer> left = new HashMap<>(), right = new HashMap<>(), count = new HashMap<>();
		int res = nums.length, maxCount = 0;
		for (int i = 0; i < nums.length; i++) {
			int x = nums[i];
			if (left.get(x) == null)
				left.put(x, i);
			right.put(x, i);
			count.put(x, count.getOrDefault(x, 0) + 1);
			maxCount = Math.max(maxCount, count.get(x));
		}
		for (int x : count.keySet()) {
			if (count.get(x) == maxCount) {
				res = Math.min(res, right.get(x) - left.get(x) + 1);
			}
		}
		return res;
	}
}
