package Assignment9_Problem1;

public class Blender extends CookingAppliance{

	@Override
	public void use(Object... appliances) {
		
		System.out.println("Running blender at "+
		appliances[0]+" speed.");
	}

	@Override
	public void clean() {
		System.out.println("Cleaning the Blender");
		
	}

}
