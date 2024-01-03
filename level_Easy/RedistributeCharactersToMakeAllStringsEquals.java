package level_Easy;

public class RedistributeCharactersToMakeAllStringsEquals {
	public boolean makeEqual(String[] words) {
		int n = words.length;
		int sum = 0;
		int[] ar = new int[26];
		for (String s : words) {
			for (char c : s.toCharArray()) {
				ar[c - 'a']++;
			}
		}
		boolean flag = true;
		for (int i : ar) {
			if (i % n != 0)
				return false;
		}
		return flag;
	}
}
