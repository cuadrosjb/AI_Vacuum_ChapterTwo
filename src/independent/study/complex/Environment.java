package independent.study.complex;

import java.util.List;

public class Environment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Floor floor = new Floor();

		Rational agentReflex = new Rational();
		// Agent agentRandom = new Reflex();

		 printFloorState(floor);

		int counter = 0;

		while (!floor.isTheFloorClean()) {

			try {
				if (floor.getFloor().get(agentReflex.getY()).get(agentReflex.getX()).isClean() == false) {
					System.out.println("One Tile at X: " + agentReflex.getX() +  " Y: " + agentReflex.getY() + " has been cleaned");
					agentReflex.clean(floor.getFloor().get(agentReflex.getY()).get(agentReflex.getX()));
					printFloorState(floor);
				}else{
//					System.out.println("floor is already cleaned...");
					
				}
			} catch (Exception e) {
				//System.out.println("We have Bumped");
				agentReflex.setBumped(true);
				
			}
			
			//if(counter == 50) break;
			counter++;
			agentReflex.move();

		}

		System.out.println("It took " + counter + " to clean this room.");

		printFloorState(floor);

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
