package level_Easy;

import java.util.Arrays;

public class FindWinnerOnATicTacToeGame {
	public String tictactoe(int[][] moves) {
		int i = 0;
		char[][] arr = new char[3][3];
		for (int j = 0; j < 3; j++) {
			Arrays.fill(arr[j], 'N');
		}
		while (i < moves.length) {
			int r = moves[i][0];
			int c = moves[i][1];
			if (i % 2 == 0) {
				arr[r][c] = 'A';
			} else {
				arr[r][c] = 'B';
			}
			i++;
		}

		for (i = 0; i < 3; i++) {
			if (arr[i][0] == 'A' && arr[i][1] == 'A' && arr[i][2] == 'A') {
				return "A";
			}
			if (arr[0][i] == 'A' && arr[1][i] == 'A' && arr[2][i] == 'A') {
				return "A";
			}
		}
		if (arr[0][0] == 'A' && arr[1][1] == 'A' && arr[2][2] == 'A') {
			return "A";
		}
		if (arr[0][2] == 'A' && arr[1][1] == 'A' && arr[2][0] == 'A') {
			return "A";
		}

		for (i = 0; i < 3; i++) {
			if (arr[i][0] == 'B' && arr[i][1] == 'B' && arr[i][2] == 'B') {
				return "B";
			}
			if (arr[0][i] == 'B' && arr[1][i] == 'B' && arr[2][i] == 'B') {
				return "B";
			}
		}
		if (arr[0][0] == 'B' && arr[1][1] == 'B' && arr[2][2] == 'B') {
			return "B";
		}
		if (arr[0][2] == 'B' && arr[1][1] == 'B' && arr[2][0] == 'B') {
			return "B";
		}

		for (i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == 'N') {
					return "Pending";
				}
			}
		}
		return "Draw";
	}
}
