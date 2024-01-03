package level_Easy;

public class ValidMountainArray {
	public boolean validMountainArray(int[] arr) {
		if (arr.length < 3)
			return false;
		int x = 1, max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				if (i == arr.length - 1)
					return false;
				max = arr[i];
			}
		}
		for (int i = 1; i < arr.length; i++) {
			if (x == 1 && arr[i - 1] >= arr[i])
				return false;
			else if (x == -1 && arr[i - 1] <= arr[i])
				return false;
			if (arr[i] == max)
				x = -1;
		}
		return true;
	}
}
