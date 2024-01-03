package level_Easy;

import java.util.Arrays;

public class MaximumSumWithExactlyKElements {
	public int maximizeSum(int[] nums, int k) {
		Arrays.sort(nums);
		int sum = 0, n = nums[nums.length - 1];
		for (int i = 0; i < k; i++) {
			sum += n;
			n++;
		}
		return sum;
	}
}
