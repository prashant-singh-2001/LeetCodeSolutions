package level_Easy;

public class MaximumEnemyFortsThatCanBeCaptured {
	public int captureForts(int[] forts) {

		int sum = 0;
		int ret = 0;
		int count = 0;

		for (int i = 0; i < forts.length; i++) {

			if (forts[i] != 0) {

				sum += forts[i];
				if (sum == 0)
					ret = Math.max(ret, count);

				sum = forts[i];
				count = 0;

			}

			else {
				if (sum != 0)
					count++;

			}
		}
		return ret;

	}
}
