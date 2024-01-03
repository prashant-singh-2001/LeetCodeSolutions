package level_Easy;

public class ConcatenationOfArray {
	public int[] getConcatenation(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n * 2];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = nums[i % n];
		}
		return ans;
	}
}
