package level_Easy;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
	public int maximumCount(int[] nums) {
		int cp = 0, cn = 0;
		for (int i : nums) {
			if (i > 0)
				cp++;
			else if (i < 0)
				cn++;
		}
		return cp > cn ? cp : cn;
	}
}
