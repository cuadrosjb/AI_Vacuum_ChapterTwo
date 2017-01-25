package independent.study;

public class Agent {
	
	
	public void scan(Tile t){
		if(!t.isClean()){
			suck(t);
		}
	}

	public int left(int position){
		return --position;
	}
	
	public int right(int position){
		return ++position;
	}
	
	public void suck(Tile t){
		t.setClean(true);
	}
}
