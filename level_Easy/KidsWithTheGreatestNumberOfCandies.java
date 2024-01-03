package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int e) {
		List<Boolean> res = new ArrayList<>();
		int max = -1;
		for (int i : candies) {
			max = max > i ? max : i;
		}
		for (int i : candies) {
			res.add((i + e) >= max);
		}
		return res;
	}
}
