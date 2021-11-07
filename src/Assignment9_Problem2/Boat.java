package Assignment9_Problem2;

public class Boat extends Vehicle{

	public Boat(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) {
		
		return (super.compareTo(o));
	}

	@Override
	public void move() {
		System.out.println("보트 : 출발합니당");
		
	}

}
