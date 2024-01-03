package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {
	public List<Boolean> prefixesDivBy5(int[] nums) {
		int n = nums.length;
		List<Boolean> answer = new ArrayList<>();
		int remainder = 0;
		for (int i = 0; i < n; i++) {
			remainder = (remainder << 1) + nums[i];
			answer.add((remainder % 5 == 0));
			remainder %= 5;
		}
		return answer;
	}
}
