package level_Easy;

import java.util.HashMap;
import java.util.Map;

public class MakeTwoArraysEqualByReversingSubarrays {
	public boolean canBeEqual(int[] t, int[] arr) {
		Map<Integer, Integer> hs = new HashMap<>();
		for (int i : t) {
			hs.put(i, hs.getOrDefault(i, 0) + 1);
		}
		for (int i : arr) {
			hs.put(i, hs.getOrDefault(i, 0) - 1);
		}
		for (Map.Entry<Integer, Integer> me : hs.entrySet()) {
			if (me.getValue() != 0)
				return false;
		}
		return true;
	}
}
