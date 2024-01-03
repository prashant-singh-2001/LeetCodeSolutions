package level_Easy;

public class LemonadeChange {
	public boolean lemonadeChange(int[] bills) {
		int five = 0;
		int ten = 0;
		for (int bill : bills) {
			if (bill == 5)
				five++;
			else if (bill == 10 && five > 0) {
				ten++;
				five--;
			} else if (bill == 20) {
				if (ten > 0) {
					if (five > 0) {
						ten--;
						five--;
					} else
						return false;
				} else if (five > 2)
					five -= 3;
				else
					return false;
			} else
				return false;
		}
		return true;
	}
}
