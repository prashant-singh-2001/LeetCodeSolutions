package level_Easy;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {
	public String reformatDate(String date) {
		Map<String, String> hs = new HashMap<>();
		hs.put("Jan", "01");
		hs.put("Feb", "02");
		hs.put("Mar", "03");
		hs.put("Apr", "04");
		hs.put("May", "05");
		hs.put("Jun", "06");
		hs.put("Jul", "07");
		hs.put("Aug", "08");
		hs.put("Sep", "09");
		hs.put("Oct", "10");
		hs.put("Nov", "11");
		hs.put("Dec", "12");
		StringBuilder s = new StringBuilder();
		s.append(date.substring(date.length() - 4));
		s.append('-');
		s.append(hs.get(date.substring(date.length() - 8, date.length() - 5)));
		s.append('-');
		if (Character.isAlphabetic(date.charAt(1)))
			s.append("0" + date.substring(0, 1));
		else
			s.append(date.substring(0, 2));
		return s.toString();
	}
}
