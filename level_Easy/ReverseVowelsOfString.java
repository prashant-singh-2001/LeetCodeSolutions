package level_Easy;

public class ReverseVowelsOfString {
	public String reverseVowels(String s) {
		char chars[] = s.toCharArray();
		int left = 0, right = s.length() - 1;
		while (left < right) {
			while (left < chars.length && chars[left] != 'A' && chars[left] != 'E' && chars[left] != 'I'
					&& chars[left] != 'O' && chars[left] != 'U' && chars[left] != 'a' && chars[left] != 'e'
					&& chars[left] != 'i' && chars[left] != 'o' && chars[left] != 'u') {
				left++;
			}
			while (right >= 0 && chars[right] != 'A' && chars[right] != 'E' && chars[right] != 'I'
					&& chars[right] != 'O' && chars[right] != 'U' && chars[right] != 'a' && chars[right] != 'e'
					&& chars[right] != 'i' && chars[right] != 'o' && chars[right] != 'u') {
				right--;
			}
			if (right > left) {
				char temp = chars[left];
				chars[left] = chars[right];
				chars[right] = temp;
				left++;
				right--;
			} else
				break;
		}
		return (new String(chars));
	}
}
