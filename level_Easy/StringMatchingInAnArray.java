package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {
	public List<String> stringMatching(String[] words) {
		List<String> lis = new ArrayList<>();
		for (String n : words) {
			for (String m : words) {
				if (m.contains(n) && !m.equals(n)) {
					lis.add(n);
					break;
				}
			}
		}
		return lis;
	}
}
