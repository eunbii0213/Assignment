package Assignment9_Problem1;

public class Toaster extends CookingAppliance{

	@Override
	public void use(Object... appliances) {
		
		System.out.println("Toasting food on "+
	appliances[0]+" at "+appliances[1]+" temperature.");
		
		
		
	}

	@Override
	public void clean() {
		
		System.out.println("Cleaning the toaster.");
		
	}

}
