package level_Easy;

public class NumberComplement {
	public int findComplement(int num) {
		int result = 0, shift = 0;
		while (num > 0) {
			result += ((num % 2) ^ 1) << shift;
			num >>= 1;
			shift++;
		}
		return result;
	}
}
