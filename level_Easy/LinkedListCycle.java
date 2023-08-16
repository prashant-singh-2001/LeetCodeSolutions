package level_Easy;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		ListNode fast = head;
		if (head == null)
			return false;
		fast = fast.next;
		while (fast != null && fast.next != null) {
			if (fast == head)
				return true;
			fast = fast.next.next;
			head = head.next;
		}
		return false;
	}
}
