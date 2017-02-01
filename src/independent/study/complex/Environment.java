package independent.study.complex;

import java.util.List;

public class Environment {

	public static void main(String[] args) {
		int adding = 0; 
		int trials = 10;

		for(int i = 0 ; i < trials ; i++)
			adding += cleanRoom();
		
		System.out.println("AVG moves : " + adding/trials);

	}

	public static int cleanRoom() {
		Floor floor = new Floor();

		Rational agentReflex = new Rational();
//		ReflexState agentReflex = new ReflexState();

		// printFloorState(floor);

		int counter = 0;

		while (!floor.isTheFloorClean()) {

			try {
				if (floor.getFloor().get(agentReflex.getY()).get(agentReflex.getX()).isClean() == false) {
					agentReflex.clean(floor.getFloor().get(agentReflex.getY()).get(agentReflex.getX()));
				}

			} catch (Exception e) {
				agentReflex.setBumped(true);

			}

			counter++;
			agentReflex.move();

		}

		return counter;
	}

	public static void printFloorState(Floor floor) {
		System.out.println("--------------------------------");

		String rowLn = "";
		for (List<Tile> row : floor.getFloor()) {
			for (Tile tile : row) {
				if (tile.isClean()) {
					rowLn += "[ ]";
				} else {
					rowLn += "[X]";
				}
			}
			System.out.println(rowLn + "\r");
			rowLn = "";

		}
	}

}
