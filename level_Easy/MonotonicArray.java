package level_Easy;

public class MonotonicArray {
	public boolean isMonotonic(int[] nums) {
		int i = 1;
		try {
			while (nums[i - 1] == nums[i]) {
				i++;
			}
		} catch (Exception e) {
			return true;
		}
		if (nums[i - 1] > nums[i]) {
			for (; i < nums.length; i++) {
				if (nums[i - 1] < nums[i])
					return false;
			}
		} else {
			for (; i < nums.length; i++) {
				if (nums[i - 1] > nums[i])
					return false;
			}
		}
		return true;
	}
}
