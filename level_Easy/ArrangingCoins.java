package level_Easy;

public class ArrangingCoins {
	public int arrangeCoins(int n) {
		return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
	}
}
