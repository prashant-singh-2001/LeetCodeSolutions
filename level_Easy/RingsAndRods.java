package level_Easy;

public class RingsAndRods {
	public int countPoints(String rings) {
		boolean[] rodR = new boolean[10];
		boolean[] rodG = new boolean[10];
		boolean[] rodB = new boolean[10];
		char[] c = rings.toCharArray();
		for (int i = 0; i < c.length; i += 2) {
			if (c[i] == 'R') {
				rodR[c[i + 1] - '0'] = true;
			}
		}
		for (int i = 0; i < c.length; i += 2) {
			if (c[i] == 'G') {
				rodG[c[i + 1] - '0'] = true;
			}
		}
		for (int i = 0; i < c.length; i += 2) {
			if (c[i] == 'B') {
				rodB[c[i + 1] - '0'] = true;
			}
		}
		int co = 0;
		for (int i = 0; i < 10; i++) {
			if (rodR[i] && rodG[i] && rodB[i])
				co++;
		}
		return co;
	}
}
