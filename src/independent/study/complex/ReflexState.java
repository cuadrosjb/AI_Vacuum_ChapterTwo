package independent.study.complex;

import java.util.List;

public class ReflexState {
	
	Blueprint blueprint;
	int row;
	int col;
	
	//use of a Stack might facility things .. 
	
	
	public ReflexState(){
		blueprint =  new Blueprint();
		row = 29;
		col = 29;
	}
	
	
	public void move(){
		//move right if possible if we cannot move right then register as wall and move down 
		
		//list all possible moves
		List<Object> lst = getAllPossibleMove();
		
	}
	
	
	
	
	public List<Object> getAllPossibleMove(){
		return null;
	}
	
	
	
}
