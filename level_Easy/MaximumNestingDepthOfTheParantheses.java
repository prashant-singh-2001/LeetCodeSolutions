package level_Easy;

public class MaximumNestingDepthOfTheParantheses {
	public int maxDepth(String s) {
		int count = 0, max = -1;
		for (char c : s.toCharArray()) {
			if (c == '(')
				count++;
			else if (c == ')')
				count--;
			max = count > max ? count : max;
		}
		return max;
	}
}
