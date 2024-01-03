package level_Easy;

public class MinimumValueToGetPosistiveStepByStepSum {
	public int minStartValue(int[] nums) {
		int n = 1;
		boolean flag = true;
		while (true) {
			int nu = n;
			flag = false;
			for (int i : nums) {
				if (i + nu < 1) {
					flag = true;
					break;
				}
				nu += i;
			}
			if (!flag)
				return n;
			n++;
		}
	}
}