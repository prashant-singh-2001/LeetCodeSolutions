package level_Easy;

public class DuplicateZeros {
	public void duplicateZeros(int[] arr) {
		int length = arr.length;
		int countZeros = 0;

		for (int i = 0; i < length; i++) {
			if (arr[i] == 0) {
				countZeros++;
			}
		}

		int newLength = length + countZeros;
		for (int i = length - 1, j = newLength - 1; i >= 0; i--, j--) {
			if (arr[i] == 0) {
				if (j < length) {
					arr[j] = 0;
				}
				j--;

				if (j < length) {
					arr[j] = 0;
				}
			} else {
				if (j < length) {
					arr[j] = arr[i];
				}
			}
		}
	}
}
