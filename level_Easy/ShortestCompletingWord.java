package level_Easy;

public class ShortestCompletingWord {
	public String shortestCompletingWord(String licensePlate, String[] words) {
		int[] charCount = new int[26];
		for (char c : licensePlate.toCharArray()) {
			if (Character.isLetter(c)) {
				charCount[Character.toLowerCase(c) - 'a']++;
			}
		}

		String result = "";
		for (String word : words) {
			int[] currCount = charCount.clone();
			boolean flag = true;
			for (char c : word.toCharArray()) {
				int index = Character.toLowerCase(c) - 'a';
				if (currCount[index] > 0) {
					currCount[index]--;
				}
			}
			for (int count : currCount) {
				if (count > 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				if (result.isEmpty() || word.length() < result.length()) {
					result = word;
				}
			}
		}
		return result;
	}
}
