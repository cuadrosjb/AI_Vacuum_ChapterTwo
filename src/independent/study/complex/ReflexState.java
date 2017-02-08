package independent.study.complex;

/**
 * @author Jeffrey Cuadros
 *
 */
public class ReflexState implements Agent {

	private Blueprint bp;
	
	private boolean bumped = false;



	private int x;
	private int y;

	private int pX = -1;
	private int pY = -1;

	public boolean isBumped() {
		return bumped;
	}

	public void setBumped(boolean bumped) {
		this.bumped = bumped;
		bp = new Blueprint();
	}

	public ReflexState() {
		generateInitailLocation();
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		y++;
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		y--;
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		x--;
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		x++;
	}

	@Override
	public void clean(Tile tile) {
		// TODO Auto-generated method stub

		System.out.println("Cleaning Tile..");
		tile.setClean(true);

	}

	@Override
	public void move() {

		if (bumped) {
			this.bumped = false;

		}
		pY = y;
		pX = x;
		bp.getBlueprint().get(pY).get(pX).setVisited(true);

		nextAction();

	}

	public void nextAction() {
		
		
		
		
	}

	private void possibleMoves() {

	}

	private void generateInitailLocation() {
		x = (int) (Math.random() * 4);
		y = (int) (Math.random() * 4);

		if (x == y) {
			y = (int) (Math.random() * 4);
		}

		System.out.println("x: " + x + " y: " + y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
