package level_Easy;

import java.util.Arrays;

public class MostFrquentEvenElement {
	public int mostFrequentEven(int[] nums) {
		int[] arr = new int[50001];
		Arrays.fill(arr, -1);
		int max = -1, ind = -1;
		for (int i : nums)
			if (i % 2 == 0)
				arr[i / 2]++;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				ind = i * 2;
			}
		}
		return ind;
	}
}
