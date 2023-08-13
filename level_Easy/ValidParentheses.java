package level_Easy;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}')
			return false;
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.isEmpty())
					return false;
				char top = stack.pop();
				if (c == ')' && top != '(')
					return false;
				if (c == ']' && top != '[')
					return false;
				if (c == '}' && top != '{')
					return false;
			}
		}
		return stack.isEmpty();
	}
}
