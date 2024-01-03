package level_Easy;

public class SmallestIndexWithEqualValue {
	public int smallestEqual(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int ind = i % 10;
			if (ind == nums[i])
				return i;
		}
		return -1;
	}
}
