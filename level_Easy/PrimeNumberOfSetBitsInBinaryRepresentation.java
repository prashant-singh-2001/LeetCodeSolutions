package level_Easy;

public class PrimeNumberOfSetBitsInBinaryRepresentation {
	public int countPrimeSetBits(int left, int right) {
		int count = 0;
		while (left <= right) {
			if (isPrime(countBits(left)))
				count++;
			left++;
		}
		return count;
	}

	public boolean isPrime(int num) {
		if (num == 0 || num == 1)
			return false;
		if (num == 2)
			return true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public int countBits(int num) {
		int count = 0;
		while (num != 0) {
			count += num & 1;
			num >>>= 1;
		}
		return count;
	}
}
