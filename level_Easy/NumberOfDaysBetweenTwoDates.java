package level_Easy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NumberOfDaysBetweenTwoDates {
	public int daysBetweenDates(String date1, String date2) {
		LocalDate localDate1 = LocalDate.parse(date1);
		LocalDate localDate2 = LocalDate.parse(date2);
		int daysBetween = Math.abs((int) ChronoUnit.DAYS.between(localDate1, localDate2));
		return daysBetween;
	}
}
