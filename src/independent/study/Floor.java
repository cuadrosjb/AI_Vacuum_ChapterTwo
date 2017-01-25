package independent.study;

public class Floor {

	int size;
	Tile[] floor;

	public Floor() {
		size = 10;
		makeFloor();
		makeFloorDity();
	}

	public Floor(int size) {
		this.size = size;
	}

	public boolean floorCleared() {
		for (Tile t : floor) {
			if (!t.isClean()) {
				return false;
			}
		}
		System.out.println("returning true");
		return true;
	}

	public void makeFloor() {
		floor = new Tile[size];
		for (int i = 0; i < size; i++) {
			floor[i] = new Tile();
		}
	}

	public Tile[] getFloor() {
		//makeFloor();
		return floor;
	}

	public void makeFloorDity() {
		int idx = 0;
		for (Tile t : floor) {

			if (idx % 3 == 0 || idx % 7 == 0) {
				t.setClean(false);
			}
			idx++;
		}

	}

}
