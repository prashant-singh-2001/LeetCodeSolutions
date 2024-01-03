package level_Easy;

public class NRepeatedElementInSize2NArray {
	public int repeatedNTimes(int[] nums) {
		int n = nums.length / 2;
		int max = Integer.MIN_VALUE;
		int num = 0;
		for (int i : nums)
			max = max > i ? max : i;
		int a[] = new int[max + 1];
		for (int i : nums)
			a[i]++;
		for (int i = 0; i < max + 1; i++) {
			if (a[i] == n) {
				num = i;
				break;
			}
		}
		return num;
	}
}
