package level_Easy;

public class FindArrayConcatenationValue {
	public long findTheArrayConcVal(int[] nums) {
		long sum = 0;
		int l = 0, r = nums.length - 1;
		if (nums.length % 2 == 1) {
			sum += nums[l + (r - l) / 2];
		}
		while (l < r) {
			sum += rst(nums[l], nums[r]);
			l++;
			r--;
		}
		return sum;
	}

	public int rst(int a, int b) {
		String s = "" + a + b;
		return Integer.parseInt(s);
	}
}
