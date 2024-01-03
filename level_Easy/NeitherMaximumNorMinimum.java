package level_Easy;

public class NeitherMaximumNorMinimum {
	public int findNonMinOrMax(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int num = -1;
		for (int i : nums)
			max = max > i ? max : i;
		for (int i : nums)
			min = min < i ? min : i;
		for (int i : nums)
			if (i != min && i != max) {
				num = i;
				break;
			}
		return num;
	}
}
