package level_Easy;

public class TimeNeededToBuyTickets {
	public int timeRequiredToBuy(int[] tickets, int k) {
		int ans = 0;
		for (int i = 0; i < tickets.length; i++) {
			if (i <= k) {
				ans += Math.min(tickets[i], tickets[k]);
			} else {
				ans += Math.min(tickets[k] - 1, tickets[i]);
			}
		}
		return ans;
	}
}
