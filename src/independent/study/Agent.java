package independent.study;

public class Agent {
	
	
	public void scan(Tile t){
		if(!t.isClean()){
			suck(t);
		}
	}

	public void left(){
		
	}
	
	public void right(){
		
	}
	
	public void suck(Tile t){
		t.setClean(true);
	}
}
