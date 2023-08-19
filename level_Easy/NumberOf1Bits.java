package level_Easy;

public class NumberOf1Bits {
	public int reverseBits(int n) {
		int reversed = 0;

		for (int i = 0; i < 32; i++) {
			reversed <<= 1;
			reversed |= (n & 1);
			n >>= 1;
		}

		return reversed;
	}
}
