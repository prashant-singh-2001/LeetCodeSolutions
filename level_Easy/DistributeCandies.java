package level_Easy;

public class DistributeCandies {
	public int distributeCandies(int[] candyType) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (var num : candyType) {
			if (num < min)
				min = num;
			if (num > max)
				max = num;
		}
		var c = new boolean[max - min + 1];

		int types = 0;
		int i = 0;
		while (i < candyType.length && types < candyType.length / 2) {
			if (!c[candyType[i] - min]) {
				c[candyType[i] - min] = true;
				types++;
			}
			i++;
		}

		return types;
	}
}
