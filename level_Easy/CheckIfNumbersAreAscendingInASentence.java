package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class CheckIfNumbersAreAscendingInASentence {
	public boolean areNumbersAscending(String s) {
		List<Integer> ls = new ArrayList<>();
		String[] ar = s.split(" ");
		for (String t : ar) {
			try {
				int x = Integer.parseInt(t);
				ls.add(x);
			} catch (Exception e) {
			}
		}
		for (int i = 0; i < ls.size() - 1; i++) {
			if (ls.get(i) >= ls.get(i + 1))
				return false;
		}
		return true;
	}
}
