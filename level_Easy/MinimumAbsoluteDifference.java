package level_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);
		List<List<Integer>> result = new ArrayList<>();
		int minDiff = Integer.MAX_VALUE;

		for (int i = 1; i < arr.length; i++) {
			int diff = arr[i] - arr[i - 1];

			if (diff < minDiff) {
				minDiff = diff;
				result.clear();
			}

			if (diff == minDiff) {
				List<Integer> pair = new ArrayList<>();
				pair.add(arr[i - 1]);
				pair.add(arr[i]);
				result.add(pair);
			}
		}

		return result;
	}
}
