package level_Easy;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
	public int minimumRecolors(String blocks, int k) {

		int start = 0;
		int end = 0;
		int ans = Integer.MAX_VALUE;
		int count = 0;
		while (end < blocks.length()) {
			if (blocks.charAt(end) == 'W') {
				count++;
			}
			if (end - start + 1 < k) {
				end++;
			} else if (end - start + 1 == k) {
				ans = Math.min(count, ans);
				if (blocks.charAt(start) == 'W') {
					count--;
				}
				start++;
				end++;
			}
		}
		return ans;
	}
}
