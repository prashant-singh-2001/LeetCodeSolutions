package level_Easy;

import java.util.Arrays;

public class BestPokerHand {
	public String bestHand(int[] ranks, char[] suits) {
		int pot = 1, max = Integer.MIN_VALUE;
		int c = 1;
		Arrays.sort(suits);
		Arrays.sort(ranks);
		for (int i = 0; i < suits.length - 1; i++) {
			if (suits[i] == suits[i + 1])
				c++;
			else
				c = 1;
			if (ranks[i] == ranks[i + 1])
				pot++;
			else {
				max = Math.max(max, pot);
				pot = 1;
			}
		}
		max = Math.max(max, pot);
		if (c == 5)
			return "Flush";
		if (max >= 3)
			return "Three of a Kind";
		else if (max == 2)
			return "Pair";
		return "High Card";
	}
}
