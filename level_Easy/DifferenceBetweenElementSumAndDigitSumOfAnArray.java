package level_Easy;

public class DifferenceBetweenElementSumAndDigitSumOfAnArray {
	public int differenceOfSum(int[] nums) {
		int s = 0, s2 = 0;
		for (int i : nums) {
			s += i;
			s2 += dig(i);
		}
		return Math.abs(s - s2);
	}

	public int dig(int n) {
		int s = 0;
		while (n != 0) {
			s += n % 10;
			n /= 10;
		}
		return s;
	}
}
