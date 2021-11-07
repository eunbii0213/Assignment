package Assignment7_Problem3;

public class Staff extends Employee{
	
	protected String title;
	
	
	Staff(String name, String address, String phoneNumber, String emailAddress, String office, int salary,
			String dateHired,String title) {
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		this.title = title;
	}


	@Override
	public String toString() {
		
		System.out.print(super.toString());
		
		return ", title : "+title+" ";
	}

}
