package level_Easy;

public class DecodeXORedArray {
	public int[] decode(int[] encoded, int first) {
		int size = encoded.length + 1, numStore = first;
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			if (i < size - 1) {
				arr[i] = numStore;
				numStore = encoded[i] ^ numStore;
			} else
				arr[i] = numStore;
		}
		return arr;
	}
}
