package level_Easy;

public class ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
		long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
		for (int num : nums) {
			if (num > first) {
				third = second;
				second = first;
				first = num;
			} else if (num > second && num < first) {
				third = second;
				second = num;
			} else if (num > third && num < second) {
				third = num;
			}
		}
		return third != Long.MIN_VALUE ? (int) third : (int) first;
	}
}
