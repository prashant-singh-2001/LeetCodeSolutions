package level_Easy;

public class TruncateSentence {
	public String truncateSentence(String s, int k) {
		StringBuilder sb = new StringBuilder();
		String[] sts = s.split(" ");
		for (int i = 0; i < k - 1; i++)
			sb.append(sts[i] + " ");
		sb.append(sts[k - 1]);
		return sb.toString();
	}

}
