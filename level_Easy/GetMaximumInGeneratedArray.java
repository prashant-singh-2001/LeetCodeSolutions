package level_Easy;

public class GetMaximumInGeneratedArray {
	public int getMaximumGenerated(int n) {
		if (n == 0)
			return 0;
		else if (n == 2 || n == 1)
			return 1;
		n++;
		int i = 1, m = 2;
		int max = 1;
		int[] arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		while (m != n) {
			if (m % 2 == 0) {
				arr[m] = arr[i];
				max = Math.max(arr[m], max);
			} else {
				arr[m] = arr[i] + arr[i + 1];
				max = Math.max(arr[m], max);
				i++;
			}
			m++;
		}
		return max;
	}
}
