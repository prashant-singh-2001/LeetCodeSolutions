package level_Easy;

public class StrongPasswordCheckerII {
	public boolean strongPasswordCheckerII(String password) {
		boolean uc = false;
		boolean lc = false;
		boolean dig = false;
		boolean sc = false;
		if (password.length() < 8)
			return false;
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if ('a' <= c && 'z' >= c)
				lc = true;
			if ('A' <= c && 'Z' >= c)
				uc = true;
			if ('0' <= c && '9' >= c)
				dig = true;
			switch (c) {
			case '!':
			case '@':
			case '#':
			case '$':
			case '%':
			case '^':
			case '&':
			case '*':
			case '(':
			case ')':
			case '+':
			case '-':
				sc = true;
				break;
			default:
			}
		}
		for (int i = 0; i < password.length() - 1; i++) {
			if (password.charAt(i) == password.charAt(i + 1))
				return false;
		}
		return uc && lc && dig && sc;
	}
}
