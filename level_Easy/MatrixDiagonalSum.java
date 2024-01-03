package level_Easy;

public class MatrixDiagonalSum {
	public int diagonalSum(int[][] mat) {
		int n = mat.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum += i == j ? mat[i][j] : 0;
				sum += (i + j) == (n - 1) ? mat[i][j] : 0;
			}
		}
		if (n % 2 == 1)
			sum -= mat[n / 2][n / 2];
		return sum;
	}
}
