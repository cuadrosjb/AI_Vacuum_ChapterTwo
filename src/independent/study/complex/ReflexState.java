package independent.study.complex;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReflexState {
	
	Blueprint blueprint;
	int row;
	int col;
	
	boolean bumped;
	
	int pRow;
	int pCol;
	
	Stack<Integer> moves;
	
	//use of a Stack might facility things .. 
	
	
	public ReflexState(){
		blueprint =  new Blueprint();
		row = 29;
		col = 29;
		moves = new Stack<Integer>();
		
		pRow = -1;
		pCol = -1;
	}
	
	public void possibleMoves(){//int right, int left, int up, int down){
		//boolean right = true, left = true, up = true, down = true;
		
		List<MovePosition> posMoves = new ArrayList<MovePosition>();
		
		
		if(blueprint.getBlueprint().get(row+1).get(col).isWall() == false){
			//up = false;
			posMoves.add(new Up(row+1, col, true));
			
		}else if(blueprint.getBlueprint().get(row-1).get(col).isWall() == false){
//			down = false;
			posMoves.add(new Down(row-1, col,true));
		}else if(blueprint.getBlueprint().get(row).get(col+1).isWall() == false){
//			right = false;
			posMoves.add(new Right(row, col+1,true));
		}else if(blueprint.getBlueprint().get(row).get(col-1).isWall() == false){
//			left = false;
			posMoves.add(new Left(row+1, col-1,true));
		}
		
		List<MovePosition> unExplorerd = new ArrayList<MovePosition>();
		
		for(MovePosition mp : posMoves){
			if(!blueprint.getBlueprint().get(mp.getY()).get(mp.getX()).isVisited()){
				unExplorerd.add(mp);
			}
		}
		
		if (unExplorerd.size() > 0) {

			for (MovePosition mp : unExplorerd) {
				col = mp.getX();
				row = mp.getY();
				return;
			}

		}else{
			for (MovePosition mp : posMoves) {
				col = mp.getX();
				row = mp.getY();
				return;
			}
		}
		
		

		
	}
	
	public void move(){
		//move right if possible if we cannot move right then register as wall and move down 

		if(bumped){
			if(pRow == row){
				//bump encounter in this row either an obstacle or wall;
				//check previous action
				blueprint.getBlueprint().get(row).get(col).setWall(true);
				
				if(pCol < col){
					//we went right
					
					col--;
					
					//set environment at row col as obstacle;
					
					
					
					
					
					
					
				}else{
					//we went left
					
					col++;
					
				}
			}else{
				blueprint.getBlueprint().get(row).get(col).setVisited(true);
			}
			
			
			
		}else if(pCol == col){
			
			blueprint.getBlueprint().get(row).get(col).setWall(true);
			
			if(pRow < row){
				//we went up
				row--;
				
			}else{
				//we went down
				row++;
				
			}
			
			
		}
		
		//list all possible moves
		List<Object> lst = getAllPossibleMove();
		
	}
	
	
	
	
	public List<Object> getAllPossibleMove(){
		return null;
	}
	
	
	
}
