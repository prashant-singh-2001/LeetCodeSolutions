package level_Easy;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] cl = Arrays.copyOf(nums, nums.length);
		int[] res = new int[nums.length];
		Arrays.sort(cl);
		int index = 0;
		for (int i : nums) {
			for (int j : cl) {
				if (i <= j)
					break;
				res[index]++;
			}
			index++;
		}
		return res;
	}
}