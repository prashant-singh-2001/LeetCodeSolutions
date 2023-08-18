package level_Medium;

public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		int min = Integer.MAX_VALUE, sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (min > Math.abs(nums[i] + nums[j] + nums[k] - target)) {
						min = Math.min(Math.abs(nums[i] + nums[j] + nums[k] - target), min);
						sum = nums[i] + nums[j] + nums[k];
					}
				}
			}
		}
		return sum;
	}
}
