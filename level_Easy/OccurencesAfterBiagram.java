package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class OccurencesAfterBiagram {
	public String[] findOcurrences(String text, String first, String second) {
		List<String> occurrences = new ArrayList<>();
		String[] words = text.split(" ");
		for (int i = 0; i < words.length - 2; i++) {
			if (words[i].equals(first) && words[i + 1].equals(second))
				occurrences.add(words[i + 2]);
		}
		return occurrences.toArray(new String[0]);
	}
}
