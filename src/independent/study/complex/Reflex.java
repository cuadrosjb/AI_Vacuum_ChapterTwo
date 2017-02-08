package independent.study.complex;

import java.util.Random;

public class Reflex implements Agent {

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

	public Reflex() {
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
			possibleMoves();
			this.bumped = false;

		} else {
			pY = y;
			pX = x;

			nextAction();
		}

	}

	public void nextAction() {

		right();
	}

	private void possibleMoves() {
		if (x > pX) {
			left();
			x = pX;
			y = pY;
			down();
		} else if (x < pX) {
			right();
			x = pX;
			y = pY;
			up();
		} else if (y > pY) {
			down();
			x = pX;
			y = pY;
			right();
		} else if (y < pY) {
			up();
			x = pX;
			y = pY;
			left();
		}
	}

	private void generateInitailLocation() {
		x = (int) (Math.random() * 3);
		y = (int) (Math.random() * 3);

		if (x == y) {
			y = (int) (Math.random() * 3);
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
