package level_Easy;

public class CheckIfWordEqualsSummationOfTwoWords {
	public boolean isSumEqual(String fw, String sw, String tw) {
		return gNV(fw) + gNV(sw) == gNV(tw);
	}

	public int gNV(String str) {
		int sum = 0;
		for (char c : str.toCharArray())
			sum = sum * 10 + (c - 'a');
		return sum;
	}
}
