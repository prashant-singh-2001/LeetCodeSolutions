package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class SplitStringsBySeparator {
	public List<String> splitWordsBySeparator(List<String> words, char sep) {
		List<String> ls = new ArrayList<>();
		for (String s : words) {
			String[] st = s.split("[" + sep + "]+");
			for (String str : st) {
				if (!str.equals(""))
					ls.add(str);
			}
		}
		return ls;
	}
}
