package level_Easy;

import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTriplets {
	public int arithmeticTriplets(int[] nums, int diff) {
		int count = 0;
		Set<Integer> list = new HashSet<>();
		for (int a : nums) {
			if (list.contains(a - diff) && list.contains(a - diff * 2))
				count++;
			list.add(a);
		}
		return count;
	}
}
