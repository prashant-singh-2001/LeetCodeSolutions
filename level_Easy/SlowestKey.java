package level_Easy;

public class SlowestKey {
	public char slowestKey(int[] rT, String kP) {
		for (int i = rT.length - 1; i > 0; i--) {
			rT[i] = rT[i] - rT[i - 1];
		}
		int max = Integer.MIN_VALUE, ind = -1;
		for (int i = 0; i < rT.length; i++) {
			if (rT[i] >= max) {
				if (max == rT[i] && (kP.charAt(i) < kP.charAt(ind)))
					continue;
				max = rT[i];
				ind = i;
			}
		}
		return kP.charAt(ind);
	}
}
