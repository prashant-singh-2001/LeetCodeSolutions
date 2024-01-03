package level_Easy;

public class CalculateDelayedArrivalTime {
	public int findDelayedArrivalTime(int at, int dt) {
		return (at + dt) % 24;
	}
}
