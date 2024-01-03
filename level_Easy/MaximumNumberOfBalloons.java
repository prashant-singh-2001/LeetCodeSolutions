package level_Easy;

public class MaximumNumberOfBalloons {
	public int maxNumberOfBalloons(String text) {
		int[] freq = new int[26];

		for (char c : text.toCharArray()) {
			freq[c - 'a']++;
		}

		int maxInstances = Integer.MAX_VALUE;
		maxInstances = Math.min(maxInstances, freq['b' - 'a']);
		maxInstances = Math.min(maxInstances, freq['a' - 'a']);
		maxInstances = Math.min(maxInstances, freq['l' - 'a'] / 2);
		maxInstances = Math.min(maxInstances, freq['o' - 'a'] / 2);
		maxInstances = Math.min(maxInstances, freq['n' - 'a']);

		return maxInstances;
	}
}
