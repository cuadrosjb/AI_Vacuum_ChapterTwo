package independent.study.complex;

import java.util.Random;

/**
 * 
 * Agent with a random move generator class that cleans the Floor Object
 * 
 * @author Jeffrey Cuadros
 *
 */
public class Rational implements Agent {

	private boolean bumped = false;

	private Random rn;

	public boolean isBumped() {
		return bumped;
	}

	public void setBumped(boolean bumped) {
		this.bumped = bumped;
	}

	private int x;
	private int y;

	private int pX = -1;
	private int pY = -1;

	/**
	 * Constructor that sets up the Agent
	 * 
	 */
	public Rational() {
		generateInitailLocation();
	}

	@Override
	public void up() {
		y++;
	}

	@Override
	public void down() {
		y--;
	}

	@Override
	public void left() {
		x--;
	}

	@Override
	public void right() {
		x++;
	}

	@Override
	public void clean(Tile tile) {

		tile.setClean(true);

	}

	/**
	 *
	 * Generates the next random move
	 */
	public void ramdonAccion() {
		rn = new Random();
		int r = rn.nextInt(4);

		if (r == 0) {
			up();
		} else if (r == 1) {
			left();
		} else if (r == 2) {
			down();
		} else if (r == 3) {
			right();
		}
	}

	/* (non-Javadoc)
	 * @see independent.study.complex.Agent#move()
	 */
	@Override
	public void move() {

		if (bumped) {
			possibleMoves();

			this.bumped = false;

		} else {
			pY = y;
			pX = x;

			ramdonAccion();
		}

	}

	/**
	 * 
	 * Since we have bumped, we need to exclude one move from our possible moves
	 * 
	 */
	private void possibleMoves() {

		if (x > pX) {
			left();
			x = pX;
			y = pY;

			rn = new Random();
			int r = rn.nextInt(4);

			if (r == 0) {
				up();
			} else if (r == 1) {
				left();
			} else if (r == 2) {
				down();
			}

		} else if (x < pX) {
			right();
			x = pX;
			y = pY;
			rn = new Random();
			int r = rn.nextInt(3);

			if (r == 0) {
				up();
			} else if (r == 1) {
				down();
			} else if (r == 2) {
				right();
			}

		} else if (y > pY) {
			down();
			x = pX;
			y = pY;
			rn = new Random();
			int r = rn.nextInt(3);

			if (r == 0) {
				left();
			} else if (r == 1) {
				down();
			} else if (r == 2) {
				right();
			}

		} else if (y < pY) {
			up();
			x = pX;
			y = pY;
			rn = new Random();
			int r = rn.nextInt(3);

			if (r == 0) {
				up();
			} else if (r == 1) {
				left();
			} else if (r == 2) {
				right();
			}

		}

	}

	/**
	 * 
	 * Sets up agent initial random position 
	 * 
	 */
	private void generateInitailLocation() {
		x = (int) (Math.random() * 4);
		y = (int) (Math.random() * 4);

		if (x == y) {
			y = (int) (Math.random() * 4);
		}

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
