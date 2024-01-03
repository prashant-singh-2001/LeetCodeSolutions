package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class KeyBoardRow {
	public String[] findWords(String[] words) {
		String[] rows = new String[] { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
		List<String> result = new ArrayList<>();
		String str;
		for (String word : words) {
			str = word;
			word = word.toLowerCase();
			boolean flag = true;
			for (String row : rows) {
				if (row.contains(String.valueOf(word.charAt(0)))) {
					for (char c : word.toCharArray()) {
						if (!row.contains(String.valueOf(c))) {
							flag = false;
							break;
						}
					}
					if (flag) {
						result.add(str);
						break;
					}
				}
			}
		}
		rows = new String[result.size()];
		int i = 0;
		for (String s : result) {
			rows[i++] = s;
		}
		return rows;
	}
}
