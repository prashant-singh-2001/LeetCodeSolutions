package level_Easy;

import java.util.ArrayList;
import java.util.List;

public class PathCrossing {
	public boolean isPathCrossing(String path) {
		List<List<Integer>> li = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
		l.add(0);
		l.add(0);
		li.add(l);
		int x = 0, y = 0;
		for (char c : path.toCharArray()) {
			if (c == 'N')
				y++;
			if (c == 'S')
				y--;
			if (c == 'E')
				x--;
			if (c == 'W')
				x++;
			l = new ArrayList<>();
			l.add(x);
			l.add(y);
			if (li.contains(l))
				return true;
			li.add(l);
		}
		return false;
	}
}
