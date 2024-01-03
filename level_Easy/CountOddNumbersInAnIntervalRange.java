package level_Easy;

public class CountOddNumbersInAnIntervalRange {
	public int countOdds(int low, int high) {
		int co = (high - low) / 2;
		if (low % 2 == 1 || high % 2 == 1)
			return ++co;
		return co;
	}
}
