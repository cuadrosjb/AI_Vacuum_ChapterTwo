package independent.study.complex;

import java.util.Random;

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

	public Rational() {
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

	public void ramdonAccion() {
		rn = new Random();
		int r = rn.nextInt(4);

		// System.out.println("rr: " + r);

		// int r = (int) (Math.random() * 3 + 1);

		if (r == 0) {
			// System.out.println("going up()");
			up();
		} else if (r == 1) {
			// System.out.println("going left()");
			left();
		} else if (r == 2) {
			// System.out.println("going down()");
			down();
		} else if (r == 3) {
			// System.out.println("going right()");
			right();
		}
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

		// System.out.println("Bumped: " + bumped);

		if (bumped) {
			// System.out.println("We have Bumped");
			//
			// System.out.println("One Tile at pX: " + pX + " pY: " + pY + " has
			// been cleaned");
			// System.out.println("One Tile at X: " + x + " Y: " + y + " has
			// been cleaned");
			possibleMoves();
			// pY = y;
			// pX = x;

			this.bumped = false;

		} else {
			// System.out.println("--One Tile at pX: " + pX + " pY: " + pY + "
			// has been cleaned");
			// System.out.println("--One Tile at X: " + x + " Y: " + y + " has
			// been cleaned");
			pY = y;
			pX = x;

			ramdonAccion();
		}

	}

	private void possibleMoves() {

		// All possible moves

		// System.out.println("possibleMoves pX: " + pX + " pY: " + pY + " has
		// been cleaned");
		// System.out.println("possibleMoves X: " + x + " Y: " + y + " has been
		// cleaned");

		if (x > pX) {
			left();
			x = pX;
			y = pY;

			rn = new Random();
			int r = rn.nextInt(4);

			// System.out.println("rr: " + r);

			// int r = (int) (Math.random() * 3 + 1);

			if (r == 0) {
				// System.out.println("going up()");
				up();
			} else if (r == 1) {
				// System.out.println("going left()");
				left();
			} else if (r == 2) {
				// System.out.println("going down()");
				down();
			}

		} else if (x < pX) {
			right();
			x = pX;
			y = pY;
			rn = new Random();
			int r = rn.nextInt(3);

			// System.out.println("rr: " + r);

			// int r = (int) (Math.random() * 3 + 1);

			if (r == 0) {
				// System.out.println("going up()");
				up();
			} else if (r == 1) {
				// System.out.println("going down()");
				down();
			} else if (r == 2) {
				// System.out.println("going right()");
				right();
			}

		} else if (y > pY) {
			down();
			x = pX;
			y = pY;
			rn = new Random();
			int r = rn.nextInt(3);

			// System.out.println("rr: " + r);

			// int r = (int) (Math.random() * 3 + 1);

			if (r == 0) {
				// System.out.println("going left()");
				left();
			} else if (r == 1) {
				// System.out.println("going down()");
				down();
			} else if (r == 2) {
				// System.out.println("going right()");
				right();
			}

		} else if (y < pY) {
			up();
			x = pX;
			y = pY;
			rn = new Random();
			int r = rn.nextInt(3);

			// System.out.println("rr: " + r);

			// int r = (int) (Math.random() * 3 + 1);

			if (r == 0) {
				// System.out.println("going up()");
				up();
			} else if (r == 1) {
				// System.out.println("going left()");
				left();
			} else if (r == 2) {
				// System.out.println("going right()");
				right();
			}

		}

		// System.out.println("---");

		// pX = x;
		// pY = y;

	}

	private void generateInitailLocation() {
		x = (int) (Math.random() * 9);
		y = (int) (Math.random() * 9);

		if (x == y) {
			y = (int) (Math.random() * 9);
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
