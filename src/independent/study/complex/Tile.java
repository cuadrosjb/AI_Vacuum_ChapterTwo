package independent.study.complex;

public class Tile {

	
	private boolean clean;
	
	public Tile(){
		clean = true;
	}
	
	public Tile(boolean clean){
		this.clean = clean;
	}

	public boolean isClean() {
		return clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}
	
}
