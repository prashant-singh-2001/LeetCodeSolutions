package level_Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestDigitInAString {
	public int secondHighest(String s) {
		List<Integer> lis = new ArrayList<>();
		for (char c : s.toCharArray()) {
			try {
				int x = Integer.parseInt(c + "");
				if (!lis.contains(x))
					lis.add(x);
			} catch (Exception e) {
			} finally {
			}
		}
		Collections.sort(lis);
		return lis.size() > 1 ? lis.get(lis.size() - 2) : -1;
	}
}
