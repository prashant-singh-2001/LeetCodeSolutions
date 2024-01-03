package level_Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberOfDistinctAverages {
	public int distinctAverages(int[] nums) {
		List<Double> list = new ArrayList<>();
		for (double x : nums) {
			list.add(x);
		}
		int left = 0;
		int right = list.size() - 1;
		Collections.sort(list);
		List<Double> average = new ArrayList<>();
		while (left < right) {
			average.add(((list.get(left) + list.get(right))) / 2);
			left++;
			right--;
		}
		Set<Double> set = new HashSet<>(average);
		return set.size();
	}
}
