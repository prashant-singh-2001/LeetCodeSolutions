package level_Easy;

public class MyHashSet {

	private int[] se;

	public MyHashSet() {
		se = new int[(int) ((Math.pow(10, 6)) / 32 + 1)];
	}

	public void add(int key) {
		se[key >> 5] |= (1 << (key & 31));
	}

	public void remove(int key) {
		if ((se[key >> 5] & (1 << (key & 31))) != 0) {
			se[key >> 5] ^= 1 << (key & 31);
		}
	}

	public boolean contains(int key) {
		return (se[key >> 5] & (1 << (key & 31))) != 0;
	}
}