package level_Easy;

public class RemoveTrailingZerosFromAString {
	public String removeTrailingZeros(String num) {
		int c = -1;
		for (int i = num.length() - 1; i > -1; i--) {
			if (num.charAt(i) == '0')
				c++;
			else
				break;
		}
		return num.substring(0, num.length() - c - 1);
	}
}
