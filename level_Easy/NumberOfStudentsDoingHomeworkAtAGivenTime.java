package level_Easy;

public class NumberOfStudentsDoingHomeworkAtAGivenTime {
	public int busyStudent(int[] st, int[] et, int qt) {
		int c = 0;
		for (int i = 0; i < st.length; i++) {
			if (qt >= st[i] && qt <= et[i])
				c++;
		}
		return c;
	}
}
