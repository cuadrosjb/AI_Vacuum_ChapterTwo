package independent.study.complex;

/**
 * 
 * Interface that helps with polymorphism 
 * 
 * @author Jeffrey Cuadros
 *
 */
public interface Agent {


	/**
	 * subtracts one to y 
	 */
	public void up();
	/**
	 * adds one to y
	 */
	public void down();
	/**
	 * subtracts one to x
	 */
	public void left();
	/**
	 * adds one to y
	 */
	public void right();
	/**
	 * calls other helper funtions to determine the next move
	 */
	public void move();
	
	/**
	 * 
	 * Books states this should be named "suck" but forgot, all
	 * it does, is it cleans the dirt on the title object.
	 * 
	 * @param tile
	 */
	public void clean(Tile tile);

	
}
