package level_Easy;

import java.util.HashSet;
import java.util.Set;

public class FindTheLosersOfTheCircularGame {
	public int[] circularGameLosers(int n, int k) {
		Set<Integer> gotBall = new HashSet<>();

		for (int i = 1, mul = 1; !gotBall.contains(i); i = (i + (k * mul)) % n, mul++) {
			gotBall.add(i);
		}
		if (gotBall.contains(0)) {
			gotBall.add(n);
			gotBall.remove(0);
		}
		int[] ans = new int[n - gotBall.size()];
		int index = 0;
		for (int i = 1; i <= n; i++)
			if (!gotBall.contains(i))
				ans[index++] = i;
		return ans;
	}
}
