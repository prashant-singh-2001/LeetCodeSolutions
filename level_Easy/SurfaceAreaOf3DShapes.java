package level_Easy;

public class SurfaceAreaOf3DShapes {
	public int surfaceArea(int[][] grid) {
		int area = 0;
		int n = grid.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				area += grid[i][j] > 0 ? 4 * grid[i][j] + 2 : 0;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				area -= 2 * Math.min(grid[i][j], grid[i][j + 1]);
			}
		}
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n - 1; i++) {
				area -= 2 * Math.min(grid[i][j], grid[i + 1][j]);
			}
		}
		return area;
	}
}
