package level_Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransformOfAnArray {
	public int[] arrayRankTransform(int[] arr) {
		int n = arr.length;
		int[] sortedArr = Arrays.copyOf(arr, n);
		Arrays.sort(sortedArr);
		Map<Integer, Integer> rankMap = new HashMap<>();
		int rank = 1;
		for (int i = 0; i < n; i++) {
			if (!rankMap.containsKey(sortedArr[i]))
				rankMap.put(sortedArr[i], rank++);
		}
		int[] result = new int[n];
		for (int i = 0; i < n; i++)
			result[i] = rankMap.get(arr[i]);
		return result;
	}
}
