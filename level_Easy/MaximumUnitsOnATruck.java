package level_Easy;

import java.util.Arrays;

public class MaximumUnitsOnATruck {
	public int maximumUnits(int[][] bT, int tS) {
		int sum = 0;
		Arrays.sort(bT, (a, b) -> b[1] - a[1]);
		for (int[] at : bT) {
			if (tS == 0)
				break;
			if (at[0] > tS) {
				sum += (tS * at[1]);
				tS = 0;
			} else {
				sum += (at[0] * at[1]);
				tS -= at[0];
			}
		}
		return sum;
	}
}
