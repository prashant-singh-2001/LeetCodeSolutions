package level_Easy;

public class IntersectionOfTwoLinkedList {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode pA = headA, pB = headB;
		while (pA != pB) {
			pA = (pA != null) ? pA.next : headB;
			pB = (pB != null) ? pB.next : headA;
		}
		return pA;
	}
}
