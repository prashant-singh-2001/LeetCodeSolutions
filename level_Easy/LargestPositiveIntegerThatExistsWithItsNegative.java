package level_Easy;

import java.util.Arrays;

public class LargestPositiveIntegerThatExistsWithItsNegative {
	public int findMaxK(int[] nums) {
		int[] arr = new int[1001];
		Arrays.fill(arr, -2);
		Arrays.sort(nums);
		for (int i : nums) {
			if (i < 0) {
				if (arr[Math.abs(i)] == 0)
					continue;
				if (arr[Math.abs(i)] == 1)
					arr[Math.abs(i)] = 0;
				else
					arr[Math.abs(i)] = -1;
			} else {
				if (arr[i] == 0)
					continue;
				if (arr[i] == -1)
					arr[i] = 0;
				else
					arr[i] = 1;
			}
		}
		for (int i = 1000; i > 0; i--) {
			if (arr[i] == 0)
				return i;
		}
		return -1;
	}
}
