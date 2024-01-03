package level_Easy;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
	public int sumOfUnique(int[] nums) {
		int sum = 0;
		Map<Integer, Integer> hs = new HashMap<>();
		for (int i : nums) {
			hs.put(i, hs.getOrDefault(i, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> me : hs.entrySet()) {
			if (me.getValue() == 1)
				sum += me.getKey();
		}
		return sum;
	}
}
