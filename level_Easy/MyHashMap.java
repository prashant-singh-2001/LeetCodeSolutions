package level_Easy;

public class MyHashMap {
	private class ListNode {
		int key;
		int value;
		ListNode next;

		public ListNode(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	private ListNode[] map;

	public MyHashMap() {
		map = new ListNode[10000];
	}

	public void put(int key, int value) {
		int index = hash(key);
		if (map[index] == null) {
			map[index] = new ListNode(-1, -1);
		}
		ListNode prev = find(map[index], key);
		if (prev.next == null) {
			prev.next = new ListNode(key, value);
		} else {
			prev.next.value = value;
		}
	}

	public int get(int key) {
		int index = hash(key);
		if (map[index] == null) {
			return -1;
		}
		ListNode node = find(map[index], key);
		return node.next == null ? -1 : node.next.value;
	}

	public void remove(int key) {
		int index = hash(key);
		if (map[index] == null) {
			return;
		}
		ListNode prev = find(map[index], key);
		if (prev.next == null) {
			return;
		}
		prev.next = prev.next.next;
	}

	private int hash(int key) {
		return Integer.hashCode(key) % map.length;
	}

	private ListNode find(ListNode head, int key) {
		ListNode node = head;
		ListNode prev = null;
		while (node != null && node.key != key) {
			prev = node;
			node = node.next;
		}
		return prev;
	}
}

/**
 * Your MyHashMap object will be instantiated and called as such: MyHashMap obj
 * = new MyHashMap(); obj.put(key,value); int param_2 = obj.get(key);
 * obj.remove(key);
 */