package level_Easy;

public class LongestNumberAtLeastTwiceOfOthers {
	public int dominantIndex(int[] nums) {
		int i = -1;
		int max = Integer.MIN_VALUE;
		for (int k = 0; k < nums.length; k++) {
			if (max < nums[k]) {
				max = nums[k];
				i = k;
			}
		}
		for (int k : nums)
			if (max < (2 * k) && max != k)
				return -1;
		return i;
	}

}
