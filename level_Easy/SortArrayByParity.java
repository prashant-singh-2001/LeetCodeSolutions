package level_Easy;

public class SortArrayByParity {
	public int[] sortArrayByParity(int[] nums) {
		if (nums.length == 1 || nums.length == 0)
			return nums;
		int l = 0, r = nums.length - 1;
		while (l < r) {
			if (nums[l] % 2 == 0)
				l++;
			else if (nums[r] % 2 != 0)
				r--;
			else {
				nums[l] = nums[l] + nums[r];
				nums[r] = nums[l] - nums[r];
				nums[l] = nums[l] - nums[r];
			}
		}
		return nums;
	}
}
