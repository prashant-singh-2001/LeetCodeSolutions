package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class DetermineIfStringHalvesAreAlike {
	public boolean halvesAreAlike(String s) {
		int lv = 0, rv = 0;
		int l = 0, r = s.length() - 1;
		List<Character> vow = new ArrayList<>();
		vow.add('a');
		vow.add('e');
		vow.add('i');
		vow.add('o');
		vow.add('u');
		vow.add('A');
		vow.add('E');
		vow.add('I');
		vow.add('O');
		vow.add('U');
		while (l < r) {
			char lc = s.charAt(l);
			char rc = s.charAt(r);
			if (vow.contains(lc))
				lv++;
			if (vow.contains(rc))
				rv++;
			l++;
			r--;
		}
		return lv == rv;
	}
}
