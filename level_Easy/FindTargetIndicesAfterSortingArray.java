package level_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
	public List<Integer> targetIndices(int[] nums, int target) {
		List<Integer> ls = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > target)
				break;
			if (nums[i] == target)
				ls.add(i);
		}
		return ls;
	}
}
