package level_Easy;

public class KeepMultiplyingFoundValuesByTwo {
	public int findFinalValue(int[] nums, int original) {
		boolean found = true;
		while (found) {
			found = false;
			for (int i : nums) {
				if (i == original) {
					original *= 2;
					found = true;
					break;
				}
			}
		}
		return original;
	}
}
