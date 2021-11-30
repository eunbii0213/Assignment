package Assignment9_Problem2;

public class Taxi extends Vehicle implements NoiseMaker{

	public Taxi(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void move() {
		System.out.println("택시 : 부릉 ");
		
	}

	@Override
	public void makeNoise() {
		System.out.println("택시 : 빵빵 ");
		
	}

}
