package level_Easy;

public class ReshapeMatrix {
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int m = mat.length, n = mat[0].length;
		if ((m == r && n == c) || (m * n != r * c))
			return mat;

		int[][] result = new int[r][c];
		int index = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				result[index / c][index % c] = mat[i][j];
				index++;
			}
		}

		return result;
	}
}
