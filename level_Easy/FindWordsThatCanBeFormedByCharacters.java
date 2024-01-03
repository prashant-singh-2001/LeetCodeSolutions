package level_Easy;

public class FindWordsThatCanBeFormedByCharacters {
	public int countCharacters(String[] words, String chars) {
		int ar[] = new int[26];
		int ar2[];
		int sum = 0;
		for (char c : chars.toCharArray())
			ar[c - 97]++;
		l1: for (String s : words) {
			ar2 = new int[26];
			for (char c : s.toCharArray())
				ar2[c - 97]++;
			for (int i = 0; i < 26; i++)
				if (ar[i] < ar2[i])
					continue l1;
			sum += s.length();
		}
		return sum;
	}
}