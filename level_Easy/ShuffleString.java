package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class ShuffleString {
	public String restoreString(String s, int[] indices) {
		List<Character> ls = new ArrayList<>(indices.length);
		for (int i : indices)
			ls.add('1');
		for (int i = 0; i < indices.length; i++) {
			ls.set(indices[i], s.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for (Character c : ls) {
			sb.append(c);
		}
		return sb.toString();
	}
}
