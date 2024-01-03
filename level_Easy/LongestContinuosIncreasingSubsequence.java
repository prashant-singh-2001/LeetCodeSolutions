package level_Easy;

public class LongestContinuosIncreasingSubsequence {
	public int findLengthOfLCIS(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int n = nums.length;
		int ans = 1;
		int curr = 1;
		for (int i = 1; i < n; i++) {
			if (nums[i] > nums[i - 1]) {
				curr++;
			} else {
				ans = Math.max(ans, curr);
				curr = 1;
			}
		}
		return Math.max(ans, curr);
	}
}
