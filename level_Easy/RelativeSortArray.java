package level_Easy;

import java.util.Arrays;
import java.util.Comparator;

public class RelativeSortArray {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		int[] indices = new int[1001];
		Arrays.fill(indices, -1);
		for (int i = 0; i < arr2.length; i++)
			indices[arr2[i]] = i;

		Comparator<Integer> customComparator = (a, b) -> {
			if (indices[a] != -1 && indices[b] != -1)
				return indices[a] - indices[b];
			else if (indices[a] != -1)
				return -1;
			else if (indices[b] != -1)
				return 1;
			else
				return a - b;
		};

		Integer[] arr1Wrapper = new Integer[arr1.length];
		for (int i = 0; i < arr1.length; i++)
			arr1Wrapper[i] = arr1[i];

		Arrays.sort(arr1Wrapper, customComparator);
		for (int i = 0; i < arr1.length; i++)
			arr1[i] = arr1Wrapper[i];

		return arr1;
	}
}
