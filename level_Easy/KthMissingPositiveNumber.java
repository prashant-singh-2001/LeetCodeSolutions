package level_Easy;

public class KthMissingPositiveNumber {
	public int findKthPositive(int[] arr, int k) {
		int i = 1, j = 1, x = 0;
		while (true) {
			if (x < arr.length && arr[x] == j) {
				x++;
				j++;
				continue;
			}
			if (i == k) {
				return j;
			}
			i++;
			j++;
		}
	}
}
