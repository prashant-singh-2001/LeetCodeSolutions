package level_Easy;

public class NumberOfGoodPairs {
	public int numIdenticalPairs(int[] nums) {
		int c = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				c += nums[i] == nums[j] ? 1 : 0;
			}
		}
		return c;
	}
}
