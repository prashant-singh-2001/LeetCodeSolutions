package level_Easy;

public class CalculateMoneyInLeetcodeBank {
	public int totalMoney(int n) {
		int sum = 0;
		int count = 1;
		int t = 2;

		for (int i = 1; i <= n; i++) {
			sum += count;
			count++;

			if (i % 7 == 0) {
				count = t;
				t++;
			}

		}
		return sum;
	}
}
