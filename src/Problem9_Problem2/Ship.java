package Problem9_Problem2;

public class Ship extends Boat{

	public Ship(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	
	public void dropAnchor() {
		System.out.println("ship : 닻 내려간당 ");
	}
	
	@Override
	public void move() {
		System.out.println("ship : 출발합니당 ");
		
	}
	
	@Override
	public int compareTo(Object o) {
		return (super.compareTo(o));
		
	}


}
