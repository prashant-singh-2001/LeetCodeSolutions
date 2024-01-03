package level_Easy;

public class HammingDistance {
	public int hammingDistance(int x, int y) {
		int xor = x ^ y;
		int d = 0;
		while (xor != 0) {
			d += xor & 1;
			xor >>= 1;
		}

		return d;
	}
}
