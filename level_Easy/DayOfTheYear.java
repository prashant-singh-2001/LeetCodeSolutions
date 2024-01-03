package level_Easy;

public class DayOfTheYear {
	public int dayOfYear(String date) {
		int sum[] = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };
		int m = Integer.parseInt(date.substring(5, 7)) - 1;
		int su = Integer.parseInt(date.substring(8, 10)) + sum[m];
		int year = Integer.parseInt(date.substring(0, 4));
		if (m > 1 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
			su++;
		return su;
	}
}
