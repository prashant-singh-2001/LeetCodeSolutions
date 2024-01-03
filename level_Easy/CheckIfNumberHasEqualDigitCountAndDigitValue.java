package level_Easy;

public class CheckIfNumberHasEqualDigitCountAndDigitValue {
	public boolean digitCount(String num) {
		int[] f = new int[10];
		for (char c : num.toCharArray())
			f[c - '0']++;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) - '0' != f[i])
				return false;
		}
		return true;
	}
}
