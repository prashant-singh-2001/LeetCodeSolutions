package level_Easy;

import java.util.Arrays;

public class MaximumSumOfArrayAfterKNegations {
	public int largestSumAfterKNegations(int[] nums, int k) {
		Arrays.sort(nums);

		int i = 0;
		while (k > 0 && i < nums.length && nums[i] < 0) {
			nums[i] = -nums[i];
			k--;
			i++;
		}

		if (k % 2 != 0) {
			Arrays.sort(nums);
			nums[0] = -nums[0];
		}

		int sum = 0;
		for (int num : nums) {
			sum += num;
		}

		return sum;
	}
}
