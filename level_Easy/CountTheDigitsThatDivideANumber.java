package level_Easy;

public class CountTheDigitsThatDivideANumber {
	public int countDigits(int num) {
		int t = num;
		int c = 0;
		while (num != 0) {
			if (t % (num % 10) == 0)
				c++;
			num /= 10;
		}
		return c;
	}
}
