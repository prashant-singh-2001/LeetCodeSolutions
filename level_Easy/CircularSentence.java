package level_Easy;

public class CircularSentence {
	public boolean isCircularSentence(String sentence) {
		String[] st = sentence.split(" ");
		int n = st.length;
		for (int i = 0; i < n; i++) {
			if (st[i % n].charAt(st[i].length() - 1) != st[(i + 1) % n].charAt(0)) {
				return false;
			}
		}
		return true;
	}
}
