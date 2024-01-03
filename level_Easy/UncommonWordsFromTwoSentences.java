package level_Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UncommonWordsFromTwoSentences {
	public String[] uncommonFromSentences(String s1, String s2) {
		Map<String, Integer> ma = new HashMap<>();
		ArrayList<String> aa = new ArrayList<>();
		String combain = s1 + " " + s2;
		for (String s : combain.split(" ")) {
			ma.put(s, ma.getOrDefault(s, 0) + 1);
		}
		System.out.println(ma);
		for (Map.Entry<String, Integer> e : ma.entrySet()) {
			if (e.getValue() == 1)
				aa.add(e.getKey());
		}
		int i = 0;
		String sa[] = new String[aa.size()];
		for (String ans : aa)
			sa[i++] = ans;
		return sa;
	}
}
