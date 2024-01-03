package level_Easy;

public class LargestTriangleArea {
	public double largestTriangleArea(int[][] points) {
		double maxArea = 0;
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				for (int k = j + 1; k < points.length; k++) {
					maxArea = Math.max(maxArea, area(points[i], points[j], points[k]));
				}
			}
		}
		return maxArea;
	}

	private double area(int[] A, int[] B, int[] C) {
		return 0.5 * Math.abs(A[0] * B[1] + B[0] * C[1] + C[0] * A[1] - A[0] * C[1] - B[0] * A[1] - C[0] * B[1]);
	}
}
