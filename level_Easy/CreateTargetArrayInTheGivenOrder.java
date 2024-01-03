package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {
	public int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> li = new ArrayList<>(nums.length);
		for (int i = 0; i < nums.length; i++)
			li.add(index[i], nums[i]);
		int[] res = new int[li.size()];
		for (int i = 0; i < li.size(); i++)
			res[i] = li.get(i);
		return res;
	}
}
