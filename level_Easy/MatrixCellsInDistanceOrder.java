package level_Easy;

public class MatrixCellsInDistanceOrder {
	public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
		int[][] result = new int[rows * cols][2];
		int index = 0;

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				result[index][0] = r;
				result[index][1] = c;
				index++;
			}
		}
		sortArray(result, rCenter, cCenter);
		return result;
	}

	private static void sortArray(int[][] arr, int rCenter, int cCenter) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				int dist1 = Math.abs(arr[j][0] - rCenter) + Math.abs(arr[j][1] - cCenter);
				int dist2 = Math.abs(arr[j + 1][0] - rCenter) + Math.abs(arr[j + 1][1] - cCenter);
				if (dist1 > dist2) {
					int[] temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
