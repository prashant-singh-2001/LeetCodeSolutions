package level_Easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOfEquivalentDominoPairs {
	public int numEquivDominoPairs(int[][] d) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int[] dd : d) {
			int value = Math.min(dd[0], dd[1]) * 10 + Math.max(dd[0], dd[1]);
			count += map.getOrDefault(value, 0);
			map.put(value, map.getOrDefault(value, 0) + 1);
		}

		return count;
	}
}
