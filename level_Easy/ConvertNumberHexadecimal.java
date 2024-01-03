package level_Easy;

public class ConvertNumberHexadecimal {
	public String toHex(int num) {
		if (num == 0)
			return "0";
		char[] hex = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		StringBuilder sb = new StringBuilder();
		while (num != 0 && sb.length() < 8) {
			int val = num & 15;
			sb.append(hex[val]);
			num = num >>> 4;
		}
		return sb.reverse().toString();
	}
}
