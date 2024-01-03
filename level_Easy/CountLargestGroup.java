package level_Easy;

public class CountLargestGroup {
	public int countLargestGroup(int n) {
		int[] arr = new int[n];
		int count = 0, size = 0, max = 0;
		for (int i = 0; i < n; i++)
			arr[i] = i + 1;
		for (int i = 0; i < n; i++) {
			if (arr[i] != -1) {
				size = 0;
				int su = s(arr[i]);
				for (int j = i + 1; j < n; j++) {
					if (su == s(arr[j])) {
						arr[j] = -1;
						size++;
					}
				}
				if (size > max) {
					max = size;
					count = 1;
				} else if (size == max) {
					count++;
				}
			} else
				continue;
		}
		return count;
	}

	private int s(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
