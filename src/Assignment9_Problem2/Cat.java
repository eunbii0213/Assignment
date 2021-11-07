package Assignment9_Problem2;

public class Cat extends Pet implements NoiseMaker{

	public Cat(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("고양이 : 냠냠");
		
	}

	@Override
	public void makeNoise() {
		System.out.println("고양이 : 애옹");
		
	}

}
