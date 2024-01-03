package level_Easy;

public class CalculateAmountPaidInTaxes {
	public double calculateTax(int[][] b, int i) {
		int p = 0;
		double tx = 0;

		for (int[] a : b) {
			if (i <= 0)
				break;

			int diff = Math.min((a[0] - p), i);

			tx += (double) diff * ((double) a[1] / 100);

			i -= diff;
			p = a[0];
		}

		return tx;
	}
}
