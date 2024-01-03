package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfMultipleArrays {
	public List<Integer> intersection(int[][] nums) {
		int[] ar = new int[1001];
		int n = nums.length;
		for (int[] nt : nums) {
			for (int i : nt) {
				ar[i]++;
			}
		}
		List<Integer> ls = new ArrayList<>();
		for (int i = 0; i < 1001; i++) {
			if (ar[i] == n)
				ls.add(i);
		}
		return ls;
	}
}
