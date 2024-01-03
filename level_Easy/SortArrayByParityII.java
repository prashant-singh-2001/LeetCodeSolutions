package level_Easy;

public class SortArrayByParityII {
	public int[] sortArrayByParityII(int[] nums) {
		if (nums.length == 1 || nums.length == 0)
			return nums;
		int l = 0, r = 1;
		while (l != nums.length && r != nums.length) {
			if (nums[l] % 2 == 0)
				l += 2;
			else if (nums[r] % 2 != 0)
				r += 2;
			else {
				nums[l] = nums[l] + nums[r];
				nums[r] = nums[l] - nums[r];
				nums[l] = nums[l] - nums[r];
			}
		}
		return nums;
	}
}
