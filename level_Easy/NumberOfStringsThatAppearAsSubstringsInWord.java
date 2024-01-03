package level_Easy;

public class NumberOfStringsThatAppearAsSubstringsInWord {
	public int numOfStrings(String[] patterns, String word) {
		int c = 0;
		for (String st : patterns) {
			if (word.contains(st))
				c++;
		}
		return c;
	}
}
