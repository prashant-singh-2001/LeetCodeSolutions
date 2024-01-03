package level_Easy;

public class MaximumNumberOfPairsInArray {
	public int[] numberOfPairs(int[] nums) {
		int cp = 0, cs = 0;
		int max = 0;
		for (int i : nums)
			max = Math.max(max, i);
		int[] nt = new int[max + 1];
		for (int i : nums)
			nt[i]++;
		for (int i : nt) {
			cp += i / 2;
			cs += i % 2;
		}
		return new int[] { cp, cs };
	}
}
