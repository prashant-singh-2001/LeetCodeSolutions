package level_Easy;

public class SquaresOfSortedArray {
	public int[] sortedSquares(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		int left = 0;
		int right = n - 1;
		int idx = n - 1;

		while (left <= right) {
			int leftSquare = nums[left] * nums[left];
			int rightSquare = nums[right] * nums[right];

			if (leftSquare > rightSquare) {
				result[idx] = leftSquare;
				left++;
			} else {
				result[idx] = rightSquare;
				right--;
			}
			idx--;
		}

		return result;
	}
}
