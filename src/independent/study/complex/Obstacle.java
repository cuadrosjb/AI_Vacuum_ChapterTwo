package independent.study.complex;

public class Obstacle {
	
	public boolean wall;
	
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
