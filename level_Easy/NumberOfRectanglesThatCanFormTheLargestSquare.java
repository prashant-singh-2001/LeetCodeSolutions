package level_Easy;

public class NumberOfRectanglesThatCanFormTheLargestSquare {
	public int countGoodRectangles(int[][] rectangles) {
		int maxLength = 0;
		int minLength;
		int count = 0;
		for (int i = 0; i < rectangles.length; i++) {
			minLength = Integer.min(rectangles[i][0], rectangles[i][1]);
			if (maxLength < minLength) {
				maxLength = minLength;
				count = 1;
			} else if (maxLength == minLength) {
				count++;
			}
		}
		return count;
	}
}
