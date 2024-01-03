package level_Easy;

public class MergeStringsAlternately {
	public String mergeAlternately(String w1, String w2) {
		StringBuffer sb = new StringBuffer();
		int i = 0, j = 0, k = 0;
		while (i < w1.length() && j < w2.length()) {
			if (k % 2 == 0) {
				sb.append(w1.charAt(i));
				i++;
				k = 1;
			} else {
				sb.append(w2.charAt(j));
				j++;
				k = 0;
			}
		}
		while (i < w1.length()) {
			sb.append(w1.charAt(i));
			i++;
		}
		while (j < w2.length()) {
			sb.append(w2.charAt(j));
			j++;
		}

		return sb.toString();
	}
}
