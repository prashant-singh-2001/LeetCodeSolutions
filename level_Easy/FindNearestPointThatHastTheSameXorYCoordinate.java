package level_Easy;

public class FindNearestPointThatHastTheSameXorYCoordinate {
	public int nearestValidPoint(int x, int y, int[][] points) {
		int min = Integer.MAX_VALUE;
		int im = -1;
		for (int i = 0; i < points.length; i++) {
			int dist = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
			if ((x == points[i][0] || y == points[i][1]) && (dist < min)) {
				min = dist;
				im = i;
			}
		}
		return im;
	}
}
