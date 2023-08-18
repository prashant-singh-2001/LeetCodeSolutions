package level_Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		int left = 0, right = 0, maxLen = 0;

		while (right < s.length()) {
			if (set.add(s.charAt(right))) {
				right++;
				maxLen = Math.max(maxLen, right - left);
			} else {
				set.remove(s.charAt(left));
				left++;
			}
		}

		return maxLen;
	}
}
