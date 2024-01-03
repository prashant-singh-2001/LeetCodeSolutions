package level_Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays2 {
	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : nums1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		List<Integer> result = new ArrayList<>();
		for (int num : nums2) {
			if (map.containsKey(num) && map.get(num) > 0) {
				result.add(num);
				map.put(num, map.get(num) - 1);
			}
		}
		int[] res = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			res[i] = result.get(i);
		}
		return res;
	}
}
