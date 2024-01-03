package level_Easy;

public class ReplaceAllDigitsWithCharacters {
	public String replaceDigits(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0)
				sb.append(s.charAt(i));
			else
				sb.append(shift(s.charAt(i - 1), Integer.parseInt(s.charAt(i) + "")));
		}
		return sb.toString();
	}

	static char shift(char c, int n) {
		return (char) (c + n);
	}

}
