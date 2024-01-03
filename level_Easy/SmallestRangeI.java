package level_Easy;

public class SmallestRangeI {
	public int smallestRangeI(int[] nums, int k) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i : nums) {
			max = i > max ? i : max;
			min = i < min ? i : min;
		}
		int ans = (max - k) - (min + k);
		ans = 0 > ans ? 0 : ans;
		return ans;
	}
}
