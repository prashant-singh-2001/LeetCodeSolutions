package level_Easy;

public class DetermineColorOfAChessboardSquare {
	public boolean squareIsWhite(String c) {
		int n = (c.charAt(0) - 'a') % 2;
		int m = (c.charAt(1) - '0') + n;
		return m % 2 == 0;
	}
}
