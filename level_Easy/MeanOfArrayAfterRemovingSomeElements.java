package level_Easy;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElements {
	public double trimMean(int[] arr) {
		double l = arr.length * 0.05;
		double sum = 0;
		Arrays.sort(arr);
		for (int i = (int) l; i < arr.length - l; i++)
			sum += arr[i];
		return sum / (arr.length - 2 * l);
	}
}
