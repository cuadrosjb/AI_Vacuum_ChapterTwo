package independent.study.complex;

import java.util.List;
import java.util.Stack;

public class ReflexState {
	
	Blueprint blueprint;
	int row;
	int col;
	
	int pRow;
	int pCol;
	
	Stack<Object> moves;
	
	//use of a Stack might facility things .. 
	
	
	public ReflexState(){
		blueprint =  new Blueprint();
		row = 29;
		col = 29;
		moves = new Stack<Object>();
		
		pRow = -1;
		pCol = -1;
	}
	
	
	public void move(){
		//move right if possible if we cannot move right then register as wall and move down 
		
		if(pRow == row){
			//bump encounter in this row either an obstacle or wall;
			//check previous action
			if(pRow < row){
				//we went right
				
				//set environment at row col as obstacle;
				blueprint.getBlueprint().get(row).get(col).setWall(true);
				
				
			}else{
				//we went left
				
			}
			
			
		}else if(pCol == col){
			if(pCol < col){
				//we went up
				
			}else{
				//we went down
				
			}
			
			
		}
		
		//list all possible moves
		List<Object> lst = getAllPossibleMove();
		
	}
	
	
	
	
	public List<Object> getAllPossibleMove(){
		return null;
	}
	
	
	
}
