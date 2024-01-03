package level_Easy;

public class FindTheTownJudge {
	public int findJudge(int n, int[][] trust) {
		int[] counts = new int[n + 1];
		for (int[] t : trust) {
			counts[t[0]]--;
			counts[t[1]]++;
		}
		for (int i = 1; i <= n; i++) {
			if (counts[i] == n - 1)
				return i;
		}
		return -1;
	}
}
