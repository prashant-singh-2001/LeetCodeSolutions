package level_Easy;

public class MaximumValueOfAStringInAArray {
	public int maximumValue(String[] strs) {
		int val = -1;
		int max = Integer.MIN_VALUE;
		for (String s : strs) {
			try {
				val = Integer.parseInt(s);
			} catch (Exception e) {
				val = s.length();
			}
			max = Math.max(val, max);
		}
		return max;
	}
}
