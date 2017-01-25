package independent.study;

import java.util.Random;

public class VacuumCleaner {

	private static final Random random = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Floor floor = new Floor();

		Agent agent = new Agent();

		int index = 0;
		int moves = 0;
		while (!floor.floorCleared()) {
			try {
				
				if (floor.getFloor()[index].isClean() == false) {
					agent.suck(floor.getFloor()[index]);
					index = getNext(index);

				} else {
					index = getNext(index);

				}
			} catch (Exception e) {
				System.out.println("bump into a wall");
				index = getNext(index);

			}
			moves++;
			System.out.println("index: " + index);
		}

		System.out.println("Is the floor cleared? " + floor.floorCleared() + " It took " + moves + " moves.");

	}

	public static int getNext(int pos) {
		if (random.nextBoolean()) {
			pos++;
			return pos;
		} else {
			pos--;
			return pos;
		}
	}
}