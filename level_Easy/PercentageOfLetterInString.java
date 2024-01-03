package level_Easy;

public class PercentageOfLetterInString {
	public int percentageLetter(String s, char letter) {
		int co = 0;
		for (char c : s.toCharArray()) {
			if (c == letter)
				co++;
		}
		return (co * 100) / s.length();
	}
}
