package level_Easy;

public class DeleteCharactersToMakeFancyString {
	public String makeFancyString(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		char prev = s.charAt(0);
		sb.append(prev);

		for (int i = 1; i < s.length(); i++) {
			char curr = s.charAt(i);
			if (curr == prev) {
				count++;
				if (count < 3) {
					sb.append(curr);
				}
			} else {
				count = 1;
				sb.append(curr);
				prev = curr;
			}
		}

		return sb.toString();
	}
}
