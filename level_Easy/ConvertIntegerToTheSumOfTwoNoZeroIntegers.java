package level_Easy;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
	public int[] getNoZeroIntegers(int n) {
		int i = 1;
		int a = n - 1;
		int b = n - a;
		while (containsZero(a) || containsZero(b)) {
			a = n - (++i);
			b = n - a;
		}
		int ar[] = { b, a };
		return ar;
	}

	private static boolean containsZero(int n) {
		while (n > 0) {
			if (n % 10 == 0) {
				return true;
			}
			n /= 10;
		}
		return false;
	}
}
