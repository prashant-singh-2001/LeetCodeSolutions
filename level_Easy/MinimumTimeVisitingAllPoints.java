package level_Easy;

public class MinimumTimeVisitingAllPoints {
	public int minTimeToVisitAllPoints(int[][] points) {
		int len = 0;
		for (int a = 0; a < points.length - 1; a++) {
			len += Math.max(Math.abs(points[a][0] - points[a + 1][0]), Math.abs(points[a][1] - points[a + 1][1]));
		}
		return len;
	}
}
