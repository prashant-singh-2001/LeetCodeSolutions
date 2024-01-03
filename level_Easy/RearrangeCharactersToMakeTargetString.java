package level_Easy;

public class RearrangeCharactersToMakeTargetString {
	public int rearrangeCharacters(String s, String target) {
		int[] arr = new int[26];
		int co = 0;
		for (char c : s.toCharArray())
			arr[c - 'a']++;
		boolean flag = true;
		l1: while (flag) {
			for (char c : target.toCharArray()) {
				if (arr[c - 'a'] == 0) {
					flag = false;
					break l1;
				}
				arr[c - 'a']--;
			}
			co++;
		}
		return co;
	}
}
