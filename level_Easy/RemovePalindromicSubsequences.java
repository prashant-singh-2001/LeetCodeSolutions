package level_Easy;

public class RemovePalindromicSubsequences {
	public int removePalindromeSub(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j)
			if (s.charAt(i++) != s.charAt(j--))
				return 2;
		return 1;
	}
}
