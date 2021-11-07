package Assignment7_Problem3;

public class Student extends Person{
	
	
	protected ClassStatus classStatus;

	Student(String name, String address, String phoneNumber, String emailAddress,ClassStatus classStatus) {
		super(name, address, phoneNumber, emailAddress);
		this.classStatus = classStatus;
	}


	
	
	@Override
	public String toString() {
		
		System.out.print(super.toString());
		return ", classStatus : "+classStatus+" ";
	}
	
}
