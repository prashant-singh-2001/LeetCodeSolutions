package level_Easy;

public class GoalParserInterpretation {
	public String interpret(String command) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < command.length();) {
			if (command.charAt(i) == 'G') {
				sb.append('G');
				i++;
			} else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
				sb.append('o');
				i += 2;
			} else {
				sb.append('a');
				sb.append('l');
				i += 4;
			}
		}
		return sb.toString();
	}
}
