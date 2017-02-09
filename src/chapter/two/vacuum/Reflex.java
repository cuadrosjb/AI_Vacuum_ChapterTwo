package chapter.two.vacuum;

import java.util.Stack;

import independent.study.complex.Tile;

public class Reflex implements Agent{
	
	private boolean bumped;
	Stack<Move> listMoves;
	private boolean[][] env;
	
	
	public void suck(Tile t){
		if(!t.isClean()){
			t.setClean(true);
		}
	}
	
	public Reflex() {
		listMoves = new Stack<Move>();
		env = new boolean[4][4];
		
		
	}
	
	public void move(){
		
		
		
		
		
		
	}
	
	
	public void getPosition(){
		int x = (int) (Math.random() * 3);
		int y = (int) (Math.random() * 3);

		if (x == y) {
			y = (int) (Math.random() * 3);
		}
		
		System.out.println("x: " + x + " y: " + y);
	}
	

}
