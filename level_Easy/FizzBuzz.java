package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		List<String> s = new ArrayList<>();
		n++;
		for (int i = 1; i < n; i++) {
			if (i % 15 == 0) {
				s.add("FizzBuzz");
				continue;
			}
			if (i % 5 == 0) {
				s.add("Buzz");
				continue;
			}
			if (i % 3 == 0) {
				s.add("Fizz");
				continue;
			}
			s.add(i + "");
		}
		return s;
	}
}
