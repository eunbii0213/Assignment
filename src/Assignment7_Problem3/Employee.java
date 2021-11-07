package Assignment7_Problem3;

public class Employee extends Person{
	
	protected String office;
	protected int salary;
	protected String dateHired;
	
	
	
	Employee(String name, String address, String phoneNumber, String emailAddress,String office,int salary,String dateHired) {
		
		super(name, address, phoneNumber, emailAddress);
		
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	@Override
	public String toString() {
		
		System.out.print(super.toString());
		
		return ", office : "+office+", salary : "+salary+", dateHired : "+dateHired;
	}
}
