package level_Easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {
	public int uniqueMorseRepresentations(String[] words) {
		String arr[] = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };
		Set<String> uq = new HashSet<>();
		for (String word : words) {
			StringBuilder sb = new StringBuilder();
			for (char c : word.toCharArray()) {
				sb.append(arr[c - 'a']);
			}
			uq.add(sb.toString());
		}
		return uq.size();
	}
}
