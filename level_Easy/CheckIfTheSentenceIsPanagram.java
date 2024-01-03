package level_Easy;

public class CheckIfTheSentenceIsPanagram {
	public boolean checkIfPangram(String s) {
		boolean[] ar = new boolean[26];
		for (char c : s.toCharArray())
			ar[c - 'a'] = true;
		for (boolean i : ar)
			if (!i)
				return false;
		return true;
	}
}
