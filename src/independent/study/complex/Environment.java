package independent.study.complex;

import java.util.List;

/**
 * @author Jeffrey Cuadros
 *
 */
public class Environment {

	/**
	 * Main method where all the calls to the collection Agent classes are made and the call to 
	 * the database to save the results of the moves made 
	 * 
	 * @param args There no need for arguments
	 */
	public static void main(String[] args) {
		
//		Connection conn = new MySQLConnection().getConnection();
//		PreparedStatement ps;
//		
//		String  sqlQuery = "Insert into ai_vacuum_cleaner(type, moves) VALUES ('Reflex', ?) ";
		
//		try {
//			 ps = conn.prepareStatement(sqlQuery);
			int adding = 0; 
			int trials = 1000;

			for(int i = 0 ; i < trials ; i++){
//				ps.setInt(1, cleanRoom());
				adding += cleanRoom();
//				ps.executeUpdate();
			}
			
			System.out.println("AVG moves : " + adding/trials);
			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		

	}

	
	/**
	 * 
	 * Helps to have a clean interphase in the main functions by encapsulation all 
	 * in one function call
	 * 
	 * 
	 * @return counter Number of movements committed by the agent to accomplish its goal
	 */
	public static int cleanRoom() {
		Floor floor = new Floor();

//		Rational agentReflex = new Rational();
		ReflexState agentReflex = new ReflexState();

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

	/**
	 * 
	 * Prints to the console the current of state of the Floor object.
	 * 
	 * 
	 * @param floor
	 */
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
