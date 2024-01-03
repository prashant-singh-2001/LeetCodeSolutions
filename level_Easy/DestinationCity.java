package level_Easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {
	public String destCity(List<List<String>> paths) {
		Map<String, Integer> hs = new HashMap<>();
		String ans = new String();
		for (List<String> path : paths) {
			hs.put(path.get(0), hs.getOrDefault(path.get(0), 0) + 1);
			hs.put(path.get(1), hs.getOrDefault(path.get(1), 0));
		}
		for (Map.Entry<String, Integer> mE : hs.entrySet()) {
			if (mE.getValue() == 0)
				ans = mE.getKey();
		}
		return ans;
	}
}
