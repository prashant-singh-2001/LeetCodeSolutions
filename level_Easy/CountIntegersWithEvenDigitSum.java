package level_Easy;

public class CountIntegersWithEvenDigitSum {
	public int countEven(int num) {
		int c = 0;
		for (int i = 1; i <= num; i++) {
			if (evenSum(i))
				c++;
		}
		return c;
	}

	public boolean evenSum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum % 2 == 0;
	}
}
