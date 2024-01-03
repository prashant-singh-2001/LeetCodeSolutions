package level_Easy;

import java.util.Arrays;

public class TheKWeakestRowsInAMatrix {
	public int[] kWeakestRows(int[][] mat, int k) {
		int[][] str = new int[mat.length][2];
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			count = 0;
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1)
					count++;
			}
			str[i][0] = i;
			str[i][1] = count;
		}
		Arrays.sort(str, (a, b) -> a[1] - b[1]);
		int[] res = new int[k];
		for (int i = 0; i < k; i++) {
			res[i] = str[i][0];
		}
		return res;
	}
}
