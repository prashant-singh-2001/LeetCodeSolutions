package level_Easy;

public class JewelsAndStones {
	public int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		for (char c : jewels.toCharArray()) {
			for (char x : stones.toCharArray())
				if (c == x)
					count++;
		}
		return count;
	}
}
