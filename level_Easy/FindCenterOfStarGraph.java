package level_Easy;

import java.util.HashMap;
import java.util.Map;

public class FindCenterOfStarGraph {
	public int findCenter(int[][] edges) {
		int ans = -1;
		Map<Integer, Integer> hs = new HashMap<>();
		for (int[] e : edges) {
			hs.put(e[0], hs.getOrDefault(e[0], 0) + 1);
			hs.put(e[1], hs.getOrDefault(e[1], 0) + 1);
		}
		for (Map.Entry<Integer, Integer> m : hs.entrySet()) {
			if (m.getValue() != 1)
				ans = m.getKey();
		}
		return ans;
	}
}
