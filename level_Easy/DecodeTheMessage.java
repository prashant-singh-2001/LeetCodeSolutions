package level_Easy;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage {
	public String decodeMessage(String key, String message) {
		Map<Character, Character> k = new HashMap<>();
		char c = 'a';
		key = key.replace(" ", "");
		for (int i = 0; i < key.length(); i++) {
			if (!k.containsKey(key.charAt(i))) {
				k.put(key.charAt(i), c);
				c++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (char x : message.toCharArray()) {
			if (k.containsKey(x))
				sb.append(k.get(x));
			else
				sb.append(x);
		}
		return sb.toString();
	}
}
