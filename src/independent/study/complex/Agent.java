package independent.study.complex;

public interface Agent {


	public void up();
	public void down();
	public void left();
	public void right();
	
	public void move();
	
	public void clean(Tile tile);

	
}
