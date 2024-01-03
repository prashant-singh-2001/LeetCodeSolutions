package level_Easy;

public class DistributeCandiesToPeople {
	public int[] distributeCandies(int candies, int num_people) {
		int[] arr = new int[num_people];
		int index = 1;
		while (candies > 0) {
			for (int i = 0; i < num_people; i++) {
				if (candies == 0)
					break;
				index = candies > index ? index : candies;
				arr[i] += index;
				candies -= index++;
			}
		}
		return arr;
	}
}
