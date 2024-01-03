package level_Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MergeTwo2DArrayBySummingValues {
	public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
		Map<Integer, Integer> hs = new HashMap<>();
		for (int[] ar : nums1) {
			hs.put(ar[0], ar[1]);
		}
		for (int[] ar : nums2) {
			hs.put(ar[0], hs.getOrDefault(ar[0], 0) + ar[1]);
		}
		int[][] arr = new int[hs.size()][2];
		int i = 0;
		for (Map.Entry<Integer, Integer> m : hs.entrySet()) {
			arr[i][0] = m.getKey();
			arr[i][1] = m.getValue();
			i++;
		}
		Arrays.sort(arr, (a, b) -> a[0] - b[0]);
		return arr;
	}
}
