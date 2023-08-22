package level_Easy;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
	Queue<Integer> queue1;
	Queue<Integer> queue2;

	/** Initialize your data structure here. */
	public MyStack() {
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
	}

	/** Push element x onto stack. */
	public void push(int x) {
		if (!queue1.isEmpty()) {
			queue1.add(x);
		} else {
			queue2.add(x);
		}
	}

	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		if (queue1.isEmpty() && queue2.isEmpty()) {
			return -1;
		}
		if (!queue1.isEmpty()) {
			while (queue1.size() > 1) {
				queue2.add(queue1.remove());
			}
			return queue1.remove();
		} else {
			while (queue2.size() > 1) {
				queue1.add(queue2.remove());
			}
			return queue2.remove();
		}
	}

	/** Get the top element. */
	public int top() {
		if (queue1.isEmpty() && queue2.isEmpty()) {
			return -1;
		}
		if (!queue1.isEmpty()) {
			while (queue1.size() > 1) {
				queue2.add(queue1.remove());
			}
			int top = queue1.peek();
			queue2.add(queue1.remove());
			return top;
		} else {
			while (queue2.size() > 1) {
				queue1.add(queue2.remove());
			}
			int top = queue2.peek();
			queue1.add(queue2.remove());
			return top;
		}
	}

	/** Returns whether the stack is empty. */
	public boolean empty() {
		return queue1.isEmpty() && queue2.isEmpty();
	}
}

/**
 * Your MyStack object will be instantiated and called as such: MyStack obj =
 * new MyStack(); obj.push(x); int param_2 = obj.pop(); int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */