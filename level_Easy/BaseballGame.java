package level_Easy;

import java.util.Stack;

public class BaseballGame {
	public int calPoints(String[] operations) {
		Stack<Integer> stack = new Stack<>();
		for (String op : operations) {
			if (op.equals("+")) {
				int last1 = stack.pop();
				int last2 = stack.pop();
				stack.push(last2);
				stack.push(last1);
				stack.push(last1 + last2);
			} else if (op.equals("D")) {
				stack.push(2 * stack.peek());
			} else if (op.equals("C")) {
				stack.pop();
			} else {
				stack.push(Integer.parseInt(op));
			}
		}
		int sum = 0;
		while (!stack.isEmpty()) {
			sum += stack.pop();
		}
		return sum;
	}
}
