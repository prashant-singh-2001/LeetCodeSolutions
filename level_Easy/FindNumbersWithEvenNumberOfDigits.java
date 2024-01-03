package level_Easy;

public class FindNumbersWithEvenNumberOfDigits {
	public int findNumbers(int[] nums) {
		int co = 0;
		for (int num : nums) {
			if (String.valueOf(num).length() % 2 == 0) {
				co++;
			}
		}
		return co;
	}
}
