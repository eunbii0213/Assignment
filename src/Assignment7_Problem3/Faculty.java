package Assignment7_Problem3;

public class Faculty extends Employee{
	

	private int officeHour;
	private Rank rank;
	
	
	
	
	Faculty(String name, String address, String phoneNumber, String emailAddress, String office, int salary,
			String dateHired,int officeHour,Rank rank) {
		
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		this.officeHour = officeHour;
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		
		System.out.print(super.toString());
		return ", officeHour : "+officeHour+", rank : "+rank;
	}
}
