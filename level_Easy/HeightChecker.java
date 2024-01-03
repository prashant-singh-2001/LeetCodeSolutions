package level_Easy;

import java.util.Arrays;

public class HeightChecker {
	public int heightChecker(int[] heights) {
		int count = 0;
		int arr[] = new int[heights.length];
		for (int i = 0; i < heights.length; i++)
			arr[i] = heights[i];
		Arrays.sort(arr);
		for (int i = 0; i < heights.length; i++)
			count += arr[i] == heights[i] ? 0 : 1;
		return count;
	}
}
