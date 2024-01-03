package level_Easy;

public class CheckIfNumberIsFascinating {
	public boolean isFascinating(int n) {
		String nStr = String.valueOf(n);
		String concatenated = nStr + (2 * n) + (3 * n);
		if (concatenated.contains("0"))
			return false;
		int arr[] = new int[10];
		for (char c : concatenated.toCharArray())
			arr[Integer.parseInt(c + "")]++;
		for (int i = 1; i < 10; i++) {
			if (arr[i] != 1)
				return false;
		}
		return true;
	}
}
