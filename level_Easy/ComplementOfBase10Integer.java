package level_Easy;

public class ComplementOfBase10Integer {
	public int bitwiseComplement(int n) {
		int numBits = (int) (Math.floor(Math.log(n) / Math.log(2))) + 1;
		int bitmask = (1 << numBits) - 1;
		return n ^ bitmask;
	}
}
