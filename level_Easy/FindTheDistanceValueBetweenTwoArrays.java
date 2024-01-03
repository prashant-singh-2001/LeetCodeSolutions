package level_Easy;

public class FindTheDistanceValueBetweenTwoArrays {
	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		int count = 0;
		boolean flag = false;
		for (int i : arr1) {
			flag = false;
			for (int j : arr2) {
				if (Math.abs(i - j) <= d) {
					flag = true;
					break;
				}
			}
			count += !flag ? 1 : 0;
		}
		return count;
	}
}
