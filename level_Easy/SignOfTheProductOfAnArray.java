package level_Easy;

public class SignOfTheProductOfAnArray {
	public int arraySign(int[] nums) {
		boolean tr = false;
		for (int i : nums) {
			if (i < 0)
				tr = !tr;
			else if (i == 0)
				return 0;
		}
		return tr ? -1 : 1;
	}
}
