package level_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositionOfLargeGroups {
	public List<List<Integer>> largeGroupPositions(String s) {
		List<List<Integer>> result = new ArrayList<>();
		int start = 0;
		int end = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(start)) {
				end = i;
			} else {
				if (end - start + 1 >= 3) {
					result.add(Arrays.asList(start, end));
				}
				start = i;
				end = i;
			}
		}
		if (end - start + 1 >= 3) {
			result.add(Arrays.asList(start, end));
		}
		return result;
	}
}
