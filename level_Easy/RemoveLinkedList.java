package level_Easy;

public class RemoveLinkedList {
	public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode prev = dummy;
		while (head != null) {
			if (head.val == val) {
				prev.next = head.next;
			} else {
				prev = head;
			}
			head = head.next;
		}
		return dummy.next;
	}
}
