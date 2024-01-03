package level_Easy;

public class RowWithMaximumOnes {
	public int[] rowAndMaximumOnes(int[][] mat) {
		int row = 0, count = 0, curr = 0;
		for (int i = 0; i < mat.length; i++) {
			curr = 0;
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1)
					curr++;
			}
			if (count < curr) {
				count = curr;
				row = i;
			}
		}
		return new int[] { row, count };
	}
}
