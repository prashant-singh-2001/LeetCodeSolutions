package level_Easy;

import java.util.Arrays;

class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		StringBuffer sb = new StringBuffer("");
		Arrays.sort(strs);
		l2: for (int i = 0; i < strs[0].length(); i++) {
			char c = strs[0].charAt(i);
			for (String s : strs) {
				if (s.charAt(i) != c)
					break l2;
			}
			sb.append(c + "");
		}
		return sb.toString();
	}
}