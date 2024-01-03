package level_Easy;

public class ShortestDistanceToACharacter {
	public int[] shortestToChar(String s, char c) {
		int[] res = new int[s.length()];
		int pos = -s.length();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				pos = i;
			res[i] = i - pos;
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == c)
				pos = i;
			res[i] = Math.min(res[i], Math.abs(pos - i));
		}
		return res;
	}
}
