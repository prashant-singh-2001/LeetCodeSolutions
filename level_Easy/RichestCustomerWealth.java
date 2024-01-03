package level_Easy;

import java.util.Arrays;

public class RichestCustomerWealth {
	public int maximumWealth(int[][] accounts) {
		int max = -1;
		for (int[] ar : accounts) {
			max = Math.max(max, Arrays.stream(ar).sum());
		}
		return max;
	}
}
