package level_Easy;

import java.util.PriorityQueue;

public class KthLargest {
	private final int k;
	private final PriorityQueue<Integer> pq;

	public KthLargest(int k, int[] nums) {
		this.k = k;
		this.pq = new PriorityQueue<>(k);

		for (int num : nums) {
			add(num);
		}
	}

	public int add(int val) {
		if (pq.size() < k) {
			pq.offer(val);
		} else if (pq.peek() < val) {
			pq.poll();
			pq.offer(val);
		}

		return pq.peek();
	}
}
