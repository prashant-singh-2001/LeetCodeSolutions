package level_Easy;

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode out = new ListNode(), t = out;
		while (head != null) {
			while (head.next != null && head.val == head.next.val)
				head = head.next;
			t.next = new ListNode(head.val);
			t = t.next;
			head = head.next;
		}
		return out.next;
	}
}

//  Definition for singly-linked list.
//class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode() {
//	}
//
//	ListNode(int val) {
//		this.val = val;
//	}
//
//	ListNode(int val, ListNode next) {
//		this.val = val;
//		this.next = next;
//	}
//}
