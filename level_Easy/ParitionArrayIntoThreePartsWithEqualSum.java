package level_Easy;

public class ParitionArrayIntoThreePartsWithEqualSum {

	public boolean canThreePartsEqualSum(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		if (sum % 3 != 0) {
			return false;
		}
		int targetSum = sum / 3;
		int count = 0;
		int runningSum = 0;
		for (int i = 0; i < arr.length; i++) {
			runningSum += arr[i];
			if (runningSum == targetSum) {
				count++;
				runningSum = 0;
			}
		}
		return count >= 3;
	}
}
