package level_Easy;

public class CountingBits {
	public int[] countBits(int num) {
		int[] ans = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			ans[i] = popcount(i);
		}
		return ans;
	}

	private int popcount(int x) {
		int count = 0;
		while (x != 0) {
			count++;
			x &= x - 1;
		}
		return count;
	}
}
