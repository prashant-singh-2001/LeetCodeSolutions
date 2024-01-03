package level_Easy;

import java.util.Stack;

public class CrawlerLogFolder {
	public int minOperations(String[] logs) {
		Stack<String> sb = new Stack<>();
		for (String s : logs) {
			if (s.equals("./"))
				continue;
			else if (!sb.isEmpty() && s.equals("../"))
				sb.pop();
			else if (!s.equals("../"))
				sb.push(s);
		}
		return sb.size();
	}
}
