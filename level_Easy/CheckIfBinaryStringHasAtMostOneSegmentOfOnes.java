package level_Easy;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
	public boolean checkOnesSegment(String s) {
		int c0 = 0, c1 = 0;
		for (char c : s.toCharArray()) {
			if (c == '1') {
				c0++;
				if (c1 != 0)
					return false;
			} else
				c1++;
		}
		return true;
	}
}
