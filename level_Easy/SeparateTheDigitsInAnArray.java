package level_Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeparateTheDigitsInAnArray {
	public int[] separateDigits(int[] nums) {
		List<Integer> res = new ArrayList<>();
		List<Integer> out = new ArrayList<>();
		for (int num : nums) {
			res = new ArrayList<>();
			int n = num;
			while (n > 0) {
				res.add(n % 10);
				n /= 10;
			}
			Collections.reverse(res);
			out.addAll(res);
		}
		int[] answer = new int[out.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = out.get(i);
		}
		return answer;
	}
}
