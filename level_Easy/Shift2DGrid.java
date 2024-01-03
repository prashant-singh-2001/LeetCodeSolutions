package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
	public List<List<Integer>> shiftGrid(int[][] grid, int k) {
		List<List<Integer>> Final_List = new ArrayList<List<Integer>>();
		k = k % (grid.length * grid[0].length);
		int[] arr = new int[grid.length * grid[0].length];
		int index = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				arr[index++] = grid[i][j];
			}
		}
		reverseArray(arr, 0, arr.length - 1);
		reverseArray(arr, 0, k - 1);
		reverseArray(arr, k, arr.length - 1);
		int index1 = 0;
		for (int i = 0; i < grid.length; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < grid[i].length; j++) {
				list.add(arr[index1++]);
			}
			Final_List.add(list);
		}
		return Final_List;
	}

	public static void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
