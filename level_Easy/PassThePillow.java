package level_Easy;

public class PassThePillow {
	public int passThePillow(int n, int time) {
		boolean f = false;
		int t = 1;
		for (int i = 0; i < time; i++) {
			if (t == 1) {
				f = !f;
			} else if (t == n) {
				f = !f;
			}
			if (f) {
				t++;
			} else {
				t--;
			}
		}
		return t;
	}
}
