package level_Easy;

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		if (head == null)
			return false;
		if (head.next == null)
			return true;
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		fast = reverseList(slow);
		slow = head;
		while (slow != null && fast != null) {
			if (slow.val != fast.val)
				return false;
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}

	ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			ListNode nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}

		return prev;
	}
}
