package level_Easy;

public class CheckIfAll1sAreAtleastLengthKPlacesAway {
	public boolean kLengthApart(int[] nums, int k) {
		int count = nums[0] == 0 ? k : 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == 1) {
				if (count < k)
					return false;
				count = 0;
			} else
				count++;
		}
		return true;
	}
}
