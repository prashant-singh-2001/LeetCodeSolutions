package level_Easy;

public class ParkingSystem {
	int big, small, medium;

	public ParkingSystem(int big, int medium, int small) {
		this.big = big;
		this.medium = medium;
		this.small = small;
	}

	public boolean addCar(int c) {
		if (c == 1) {
			big--;
			return big < 0 ? false : true;
		}
		if (c == 2) {
			medium--;
			return medium < 0 ? false : true;
		}
		if (c == 3) {
			small--;
			return small < 0 ? false : true;
		}
		return false;
	}
}