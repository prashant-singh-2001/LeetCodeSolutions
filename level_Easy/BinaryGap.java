package level_Easy;

public class BinaryGap {
	public int binaryGap(int n) {
		int prev = -1;
		int tc = 0;
		int mx = -1, ct = 0;
		while (n > 0) {
			int r = n & 1;
			if (r == 1) {
				++tc;
				prev = 0;
				mx = Math.max(ct, mx);
				ct = 0;

			} else {
				if (prev != -1) {
					ct++;
				}
			}
			n = n >> 1;
		}
		if (tc <= 1) {
			return 0;
		}
		return mx + 1;
	}
}
