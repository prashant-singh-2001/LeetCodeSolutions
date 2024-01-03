package level_Easy;

public class SetMismatch {
	public int[] findErrorNums(int[] nums) {
		int arr[] = new int[nums.length];
		for (int n : nums) {
			arr[n - 1]++;
		}
		int ar[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				ar[1] = i + 1;
			if (arr[i] == 2)
				ar[0] = i + 1;
		}
		return ar;
	}
}
