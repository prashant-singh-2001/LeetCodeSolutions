package level_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams {
	public List<String> removeAnagrams(String[] words) {
		String prev = "";
		List<String> li = new ArrayList<>();
		for (int i = 0; i < words.length; i++) {
			char[] ch = words[i].toCharArray();
			Arrays.sort(ch);
			String curr = String.valueOf(ch);
			if (!curr.equals(prev)) {
				li.add(words[i]);
				prev = curr;
			}
		}
		return li;
	}
}
