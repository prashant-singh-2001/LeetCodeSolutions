package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
	public List<String> readBinaryWatch(int num) {
		List<String> result = new ArrayList<>();
		for (int h = 0; h < 12; h++) {
			for (int m = 0; m < 60; m++) {
				if (Integer.bitCount(h) + Integer.bitCount(m) == num) {
					result.add(String.format("%d:%02d", h, m));
				}
			}
		}
		return result;
	}
}
