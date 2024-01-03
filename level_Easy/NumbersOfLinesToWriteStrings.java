package level_Easy;

public class NumbersOfLinesToWriteStrings {
	public int[] numberOfLines(int[] widths, String s) {
		int[] res = new int[2];
		int lines = 1;
		int width = 0;
		for (char c : s.toCharArray()) {
			int charWidth = widths[c - 'a'];
			if (width + charWidth > 100) {
				lines++;
				width = charWidth;
			} else {
				width += charWidth;
			}
		}
		res[0] = lines;
		res[1] = width;
		return res;
	}
}