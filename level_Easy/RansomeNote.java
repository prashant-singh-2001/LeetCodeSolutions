package level_Easy;

public class RansomeNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		int ar1[] = new int[26];
		int ar2[] = new int[26];
		for (char c : ransomNote.toCharArray()) {
			ar1[c - 97]++;
		}
		for (char c : magazine.toCharArray()) {
			ar2[c - 97]++;
		}
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] != 0 && ar1[i] > ar2[i])
				return false;
		}
		return true;
	}
}
