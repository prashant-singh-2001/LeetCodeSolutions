package level_Medium;

public class ZigzagConversion {
	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		int cycleLen = 2 * numRows - 2;
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j + i < s.length(); j += cycleLen) {
				res.append(s.charAt(j + i));
				if (i != 0 && i != numRows - 1 && j + cycleLen - i < s.length())
					res.append(s.charAt(j + cycleLen - i));
			}
		}
		return res.toString();
	}
}
