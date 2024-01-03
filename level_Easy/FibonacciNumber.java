package level_Easy;

public class FibonacciNumber {
	public int fib(int n) {
		if (n < 2) {
			return n;
		}
		int first = 0;
		int second = 1;

		int prev;
		for (int i = 1; i < n; i++) {
			prev = first;
			first = second;
			second += prev;
		}
		return second;
	}
}
