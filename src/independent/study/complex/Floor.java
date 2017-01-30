package independent.study.complex;

import java.util.ArrayList;
import java.util.List;

public class Floor {

	List<List<Tile>> floor;

	public Floor() {
		floor = new ArrayList<List<Tile>>();
		createFloor();
	}

	public void createFloor() {
		List<Tile> row;
		for (int j = 0; j < 10; j++) {
			row = new ArrayList<Tile>();
			for (int i = 0; i < 10; i++) {
				if (placeDirt() % 3 == 0){
					row.add(new Tile(false));
				}else{
					row.add(new Tile(true));
				}
			}
			floor.add(row);
		}
	}

	public int placeDirt() {
		return (int) (Math.random() * 10);
	}
	
	public List<List<Tile>> getFloor(){
		return floor;
	}
	
	public boolean isTheFloorClean(){
		for(List<Tile> lst : floor){
			for(Tile t : lst){
				if(t.isClean() == false) return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args){
		Floor f = new Floor();
		
		for(List<Tile> lst : f.getFloor()){
			for(Tile t : lst){
				System.out.println(t.isClean());
			}
			System.out.println("\r");
		}
		
		
		
	}

}
