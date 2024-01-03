package level_Easy;

public class LongestPalindrome {
	public int longestPalindrome(String s) {
		int arr[] = new int[52];
		int count1s = 0;
		int sum = 0;
		for (char a : s.toCharArray()) {
			if (Character.isLowerCase(a))
				arr[a - 71]++;
			else
				arr[a - 65]++;
		}
		for (int i : arr) {
			sum += (i / 2);
			if (i % 2 == 1)
				count1s++;
		}
		return count1s > 0 ? sum * 2 + 1 : sum * 2;
	}
}
