package independent.study.complex;

public class Right implements MovePosition{

	private int x;
	private int y;
	
	
	public Right(int x, int y, boolean move) {
		this.x = x;
		this.y = y;
		this.move = move;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Right(){
		
	}
	public Right(boolean move){
		this.move = move;
	}
	
	private boolean move;
	
	

	public boolean isMove() {
		return move;
	}

	public void setMove(boolean move) {
		this.move = move;
	}
	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}
}
