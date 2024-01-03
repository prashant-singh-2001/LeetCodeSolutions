package level_Easy;

public class FindHighestAltitude {
	public int largestAltitude(int[] gain) {
		int sum = 0, max = 0;
		for (int i : gain) {
			sum += i;
			max = max > sum ? max : sum;
		}
		return max;
	}
}
