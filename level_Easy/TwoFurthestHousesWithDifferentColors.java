package level_Easy;

public class TwoFurthestHousesWithDifferentColors {
	public int maxDistance(int[] colors) {
		int dist = -1;
		for (int i = 0; i < colors.length; i++) {
			for (int j = colors.length - 1; j > -1; j--) {
				if (colors[i] != colors[j])
					dist = Math.max(dist, j - i);
			}
		}
		return dist;
	}
}
