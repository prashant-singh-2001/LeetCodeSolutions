package level_Easy;

public class ElementAppearingMoreThan25PercentInSortedArray {
	public int findSpecialInteger(int[] arr) {
		if (arr.length == 1)
			return arr[0];
		int n = arr.length / 4;
		int c = 1, num = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				c++;
				if (c > n) {
					num = arr[i];
				}
			} else
				c = 1;
		}
		return num;
	}
}
