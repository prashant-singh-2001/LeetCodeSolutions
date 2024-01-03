package level_Easy;

public class FindUniqueCharacterString {
	public int firstUniqChar(String s) {
		for (char a : s.toCharArray()) {
			if (s.indexOf(a) == s.lastIndexOf(a))
				return s.indexOf(a);
		}
		return -1;
	}
}
