package level_Easy;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentIntegersInAString {
	public int numDifferentIntegers(String word) {
		String[] arr = word.replaceAll("[a-zA-Z]", " ").split("\\s+");
		Set<String> set = new HashSet<String>();

		for (String str : arr) {
			if (!str.isEmpty())
				set.add(String.valueOf(str.replaceAll("^0*", "")));
		}

		return set.size();
	}
}
