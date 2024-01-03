package level_Easy;

public class AverageValueOfEvenNumbersThatAreDivisibleByThree {
	public int averageValue(int[] nums) {
		int c = 0, sum = 0;
		for (int i : nums) {
			if (i % 6 == 0) {
				c++;
				sum += i;
			}
		}
		return c != 0 ? sum / c : 0;
	}
}
