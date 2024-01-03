package level_Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeSimilarItems {
	public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
		Map<Integer, Integer> hs = new HashMap<>();
		for (int[] n : items1) {
			hs.put(n[0], n[1]);
		}
		for (int[] n : items2) {
			hs.put(n[0], hs.getOrDefault(n[0], 0) + n[1]);
		}
		List<List<Integer>> lis = new ArrayList<>();
		for (Map.Entry<Integer, Integer> m : hs.entrySet()) {
			List<Integer> ls = new ArrayList<>();
			ls.add(m.getKey());
			ls.add(m.getValue());
			lis.add(ls);
		}
		Collections.sort(lis, (a, b) -> a.get(0) - b.get(0));
		return lis;
	}
}
