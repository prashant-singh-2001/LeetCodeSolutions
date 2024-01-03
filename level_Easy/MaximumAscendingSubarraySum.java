package level_Easy;

public class MaximumAscendingSubarraySum {
	public int maxAscendingSum(int[] nums) {
		int cur = nums[0], max = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] < nums[i]) {
				cur += nums[i];
			} else {
				max = max > cur ? max : cur;
				cur = nums[i];
			}
		}
		max = max > cur ? max : cur;
		return max;
	}
}
