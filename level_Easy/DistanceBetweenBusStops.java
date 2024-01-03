package level_Easy;

public class DistanceBetweenBusStops {
	public int distanceBetweenBusStops(int[] distance, int start, int destination) {
		int n = distance.length;
		int totalDistance = 0;
		for (int d : distance) {
			totalDistance += d;
		}

		int clockwiseDistance = 0;
		int counterclockwiseDistance = 0;

		if (start < destination) {
			for (int i = start; i < destination; i++) {
				clockwiseDistance += distance[i];
			}
		} else {
			for (int i = start; i < n; i++) {
				clockwiseDistance += distance[i];
			}
			for (int i = 0; i < destination; i++) {
				clockwiseDistance += distance[i];
			}
		}

		counterclockwiseDistance = totalDistance - clockwiseDistance;

		return Math.min(clockwiseDistance, counterclockwiseDistance);
	}
}
