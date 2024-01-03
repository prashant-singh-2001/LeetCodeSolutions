package level_Easy;

public class CountPrefixesOfAGivenString {
	public int countPrefixes(String[] words, String s) {
		int c = 0;
		for (String st : words) {
			if (st.length() <= s.length() && s.substring(0, st.length()).equals(st))
				c++;
		}
		return c;
	}
}
