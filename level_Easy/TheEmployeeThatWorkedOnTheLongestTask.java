package level_Easy;

import java.util.HashMap;
import java.util.Map;

public class TheEmployeeThatWorkedOnTheLongestTask {
	public int hardestWorker(int n, int[][] logs) {
		Map<Integer, Integer> hs = new HashMap<>();
		for (int i = 0; i < n; i++)
			hs.put(i, 0);
		for (int i = 0; i < logs.length; i++) {
			if (i == 0) {
				hs.put(logs[i][0], logs[i][1]);
			} else
				hs.put(logs[i][0], Math.max(hs.get(logs[i][0]), logs[i][1] - logs[i - 1][1]));
		}
		int max = -1;
		int person = -1;
		for (Map.Entry<Integer, Integer> m : hs.entrySet()) {
			if (m.getValue() > max) {
				max = m.getValue();
				person = m.getKey();
			}
		}
		return person;
	}
}
