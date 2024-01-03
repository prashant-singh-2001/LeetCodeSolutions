package level_Easy;

public class TotalDistanceTraveled {
	public int distanceTraveled(int mainTank, int additionalTank) {
		int dist = 0;
		while (mainTank > 0) {
			dist++;
			mainTank--;
			if (dist != 0 && dist % 5 == 0 && additionalTank > 0) {
				additionalTank--;
				mainTank++;
			}
		}
		return dist * 10;
	}
}
