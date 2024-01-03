package level_Easy;

public class StudentAttendanceRecordI {
	public boolean checkRecord(String s) {
		int cA = 0, cL = 0;
		for (char c : s.toCharArray()) {
			if (c == 'A') {
				cA++;
				if (cA > 1)
					return false;
			}
			if (c == 'L') {
				cL++;
				if (cL >= 3)
					return false;
			} else
				cL = 0;
		}
		return true;
	}
}
