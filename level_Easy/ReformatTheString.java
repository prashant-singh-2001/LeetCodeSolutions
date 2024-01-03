package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class ReformatTheString {
	public String reformat(String s) {
		List<Character> num = new ArrayList<>();
		List<Character> chr = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)))
				num.add(s.charAt(i));
			else
				chr.add(s.charAt(i));
		}
		if (Math.abs(num.size() - chr.size()) > 1)
			return "";
		StringBuilder sb = new StringBuilder();
		if (num.size() >= chr.size()) {
			for (int i = 0; i < num.size(); i++) {
				sb.append(num.get(i));
				if (i < chr.size())
					sb.append(chr.get(i));
			}
		} else {
			for (int i = 0; i < chr.size(); i++) {
				sb.append(chr.get(i));
				if (i < num.size())
					sb.append(num.get(i));
			}
		}
		return sb.toString();
	}
}
