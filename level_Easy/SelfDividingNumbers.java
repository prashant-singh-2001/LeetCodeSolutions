package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> lis = new ArrayList<>();
		while (left <= right) {
			if (selfdiv(left))
				lis.add(left);
			left++;
		}
		return lis;
	}

	boolean selfdiv(int num) {
		int n = num;
		while (n > 0) {
			int digit = n % 10;
			if (digit == 0 || num % digit != 0) {
				return false;
			}
			n /= 10;
		}
		return true;
	}

}
