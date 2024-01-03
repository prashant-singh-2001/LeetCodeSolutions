package level_Easy;

public class CountSquareSumTriples {
	public int countTriples(int n) {
		int count = 0;
		for (int a = 1; a < n; a++)
			for (int b = 1; b < n; b++) {
				double c = Math.sqrt(a * a + b * b);
				if (c == (int) c && c <= n)
					count++;
			}
		return count;
	}
}
