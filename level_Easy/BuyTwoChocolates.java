package level_Easy;

import java.util.Arrays;

public class BuyTwoChocolates {
	public int buyChoco(int[] prices, int money) {
		Arrays.sort(prices);
		int sum = prices[0] + prices[1];
		return sum <= money ? money - sum : money;
	}
}
