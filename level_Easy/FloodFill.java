package level_Easy;

public class FloodFill {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		if (image[sr][sc] == newColor) {
			return image;
		}
		fill(image, sr, sc, image[sr][sc], newColor);
		return image;
	}

	private void fill(int[][] image, int i, int j, int color, int newColor) {
		if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != color) {
			return;
		}
		image[i][j] = newColor;
		fill(image, i + 1, j, color, newColor);
		fill(image, i - 1, j, color, newColor);
		fill(image, i, j + 1, color, newColor);
		fill(image, i, j - 1, color, newColor);
	}
}
