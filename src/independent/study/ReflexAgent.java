package independent.study;

public class ReflexAgent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Floor floor = new Floor();

		Agent agent = new Agent();
		
		int index = startingPoint();
		
		int moves =0 ;

		while (!floor.floorCleared()) {
			try {
				agent.scan(floor.getFloor()[index]);
				index = agent.right(index);
				//System.out.println("Right index: " + index);
			} catch (Exception e) {
				//System.out.println("We bumped into a wall");
				index = agent.left(index);
				//System.out.println("Left index: " + index);
			}
			moves++;
			if(moves == 1000){
				break;
			}
		}

		System.out.println("Is the floor cleared? " + floor.floorCleared() + " It took " + moves + " moves.");

	}
	
	public static int startingPoint(){
		
		
		return 2;
	}

}