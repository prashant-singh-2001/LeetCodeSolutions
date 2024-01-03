package level_Easy;

public class ThousandSeparator {
	public String thousandSeparator(int n) {
		StringBuilder sb = new StringBuilder();
		if (n == 0)
			return "0";
		int count = 0;
		while (n != 0) {
			if (count == 3) {
				sb.insert(0, '.');
				sb.insert(0, n % 10 + "");
				count = 0;
			} else {
				sb.insert(0, n % 10 + "");
			}
			count++;
			n /= 10;
		}
		return sb.toString();
	}
}
