package level_Easy;

public class NumberOfSeniorCitizens {
	public int countSeniors(String[] details) {
		int c = 0;
		for (String d : details) {
			if (Integer.parseInt(d.substring(11, 13).toString()) > 60)
				c++;
		}
		return c;
	}
}
