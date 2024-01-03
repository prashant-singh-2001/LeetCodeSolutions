package level_Easy;

public class CountAsterisks {
	public int countAsterisks(String s) {
		int c = 0;
		boolean flag = false;
		for (char ch : s.toCharArray()) {
			if (ch == '|') {
				flag = !flag;
			}
			if (!flag && ch == '*')
				c++;
		}
		return c;
	}
}
