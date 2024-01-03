package level_Easy;

public class ApplyOperationsToAnArray {
	public int[] applyOperations(int[] nums) {
		for (int i = 0; i < nums.length - 1;) {
			if (nums[i] == nums[i + 1]) {
				nums[i] *= 2;
				nums[i + 1] = 0;
				i += 2;
			} else
				i++;
		}
		moveZeroes(nums);
		return nums;
	}

	public static void moveZeroes(int[] nums) {
		int nonZeroIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[nonZeroIndex++] = nums[i];
			}
		}
		for (int i = nonZeroIndex; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
}
