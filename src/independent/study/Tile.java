package independent.study;

public class Tile {

	boolean clean;
	
	public Tile(){
		clean = true;
	}

	public boolean isClean() {
		return clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

	@Override
	public String toString() {
		return "Tile [clean=" + clean + "]";
	}

}
