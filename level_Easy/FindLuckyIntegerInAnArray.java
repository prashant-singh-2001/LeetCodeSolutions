package level_Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerInAnArray {
	public int findLucky(int[] arr) {
		Arrays.sort(arr);
		Map<Integer, Integer> lis = new HashMap<>();
		for (int i : arr) {
			lis.put(i, lis.getOrDefault(i, 0) + 1);
		}
		for (int i = arr.length - 1; i > -1; i--) {
			if (arr[i] == lis.get(arr[i]))
				return arr[i];
		}
		return -1;
	}
}
