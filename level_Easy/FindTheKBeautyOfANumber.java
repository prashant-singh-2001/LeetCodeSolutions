package level_Easy;

public class FindTheKBeautyOfANumber {
	public int divisorSubstrings(int num, int k) {
		String s = "" + num;
		int b = 0;
		for (int i = 0; i < s.length() - k + 1; i++) {
			try {
				if (num % Integer.parseInt(s.substring(i, i + k)) == 0)
					b++;
			} catch (Exception e) {
			}
		}
		return b;
	}
}
