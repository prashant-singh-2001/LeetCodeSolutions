package level_Easy;

public class FindBadVersion {
	public int firstBadVersion(int n) {
		int l = 1, r = n;
		int mid = l + (r - l) / 2;
		;
		while (l < r) {
			mid = l + (r - l) / 2;
//			if (isBadVersion(mid))
			r = mid;
//			else
			l = mid + 1;
		}
		return l;
	}
}
