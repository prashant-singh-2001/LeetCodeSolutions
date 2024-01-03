package level_Easy;

public class CountBinarySubstrings {
	public int countBinarySubstrings(String s) {
		int n = s.length();
		int count = 0, prev = 0, cur = 1;
		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				cur++;
			} else {
				count += Math.min(prev, cur);
				prev = cur;
				cur = 1;
			}
		}
		count += Math.min(prev, cur);
		return count;
	}
}
