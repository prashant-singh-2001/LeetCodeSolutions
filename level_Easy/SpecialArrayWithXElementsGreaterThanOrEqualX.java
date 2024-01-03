package level_Easy;

public class SpecialArrayWithXElementsGreaterThanOrEqualX {
	public int specialArray(int[] nums) {
		int n = 0;
		int count = 0;
		while (n != nums.length + 1) {
			count = 0;
			for (int i : nums) {
				if (i >= n) {
					count++;
				}
			}
			if (n == count)
				return n;
			n++;
		}
		return -1;
	}
}
