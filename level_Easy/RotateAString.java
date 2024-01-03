package level_Easy;

public class RotateAString {
	public boolean rotateString(String s, String goal) {
		if (s.length() != goal.length()) {
			return false;
		}
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < s.length(); i++) {
			if (!sb.toString().equals(goal)) {
				sb.deleteCharAt(0);
				sb.append(s.charAt(i));
			} else {
				return true;
			}
		}
		return false;
	}
}
