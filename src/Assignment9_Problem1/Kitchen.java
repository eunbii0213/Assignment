package Assignment9_Problem1;

public class Kitchen {

	public static void main(String[] args) {
		CookingAppliance a = new Blender();
		
		a.use("high");
		a.clean();
		
		a = new Toaster();
		a.use("pizza","low");
		a.clean();

	}

}
