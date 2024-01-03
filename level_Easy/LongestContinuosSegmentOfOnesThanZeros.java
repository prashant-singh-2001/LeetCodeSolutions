package level_Easy;

public class LongestContinuosSegmentOfOnesThanZeros {
	public boolean checkZeroOnes(String s) {
		int m0 = -1, m1 = -1, c0 = 0, c1 = 0;
		for (char c : s.toCharArray()) {
			int n = c - '0';
			if (n == 0) {
				c0++;
				c1 = 0;
			} else {
				c1++;
				c0 = 0;
			}
			m0 = Math.max(m0, c0);
			m1 = Math.max(m1, c1);
		}
		return m1 > m0;
	}
}
