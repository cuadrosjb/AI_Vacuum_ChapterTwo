package independent.study.complex;

import java.util.ArrayList;
import java.util.List;

public class Blueprint {
	List<List<Obstacle>> bp;

	public Blueprint() {
		bp = new ArrayList<List<Obstacle>>();
		createFloor();
	}
	
	public void printFloorState() {
		System.out.println("--------------------------------");

		String rowLn = "";
		for (List<Obstacle> row : bp) {
			for (Obstacle ob : row) {
				if (ob.isWall()) {
					rowLn += "[ ]";
				} else {
					rowLn += "[X]";
				}
			}
			System.out.println(rowLn + "\r");
			rowLn = "";

		}
	}

	public void createFloor() {
		List<Obstacle> row;
		for (int j = 0; j < 60; j++) {
			row = new ArrayList<Obstacle>();
			for (int i = 0; i < 60; i++) {
				
					row.add(new Obstacle(false));
				
			}
			bp.add(row);
		}
	}


	public List<List<Obstacle>> getBlueprint() {
		return bp;
	}




	public static void main(String[] args) {
		Floor f = new Floor();

		for (List<Tile> lst : f.getFloor()) {
			for (Tile t : lst) {
				System.out.println(t.isClean());
			}
			System.out.println("\r");
		}

	}


}
