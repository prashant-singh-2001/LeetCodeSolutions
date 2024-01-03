package level_Easy;

public class MinimumDistanceToTheTargetElement {
	public int getMinDistance(int[] nums, int target, int start) {
		int min = Integer.MAX_VALUE;
		for (int i = start; i < nums.length; i++)
			if (nums[i] == target) {
				min = Math.min(min, Math.abs(start - i));
			}
		for (int i = start; i > -1; i--)
			if (nums[i] == target) {
				min = Math.min(min, Math.abs(start - i));
			}
		return min;
	}
}
