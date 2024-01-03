package level_Easy;

public class SortingTheSentence {
	public String sortSentence(String s) {
		String[] st = s.split(" ");
		String[] sts = new String[st.length];
		for (String str : st) {
			int ind = (str.charAt(str.length() - 1) - '0') - 1;
			sts[ind] = str.substring(0, str.length() - 1);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sts.length - 1; i++) {
			sb.append(sts[i]);
			sb.append(" ");
		}
		sb.append(sts[sts.length - 1]);
		return sb.toString();
	}
}
