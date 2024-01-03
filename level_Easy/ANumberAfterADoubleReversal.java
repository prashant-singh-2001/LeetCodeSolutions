package level_Easy;

public class ANumberAfterADoubleReversal {
	public boolean isSameAfterReversals(int num) {
		int rev = 0;
		int t = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		while (rev != 0) {
			num = num * 10 + rev % 10;
			rev /= 10;
		}
		return num == t;
	}
}
