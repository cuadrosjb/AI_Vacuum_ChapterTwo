package independent.study.complex;

public class Obstacle {
	
	private boolean wall;
	private boolean visited;
	
	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Obstacle(){
		
	}
	
	public Obstacle(boolean wall){
	this.wall = 	wall;
	}

	public boolean isWall() {
		return wall;
	}

	public void setWall(boolean wall) {
		this.wall = wall;
	}
	
	

}
