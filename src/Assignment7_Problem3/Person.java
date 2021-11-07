package Assignment7_Problem3;

public class Person {
	
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String emailAddress;
	
	Person(String name,String address,String phoneNumber,String emailAddress){
		
		this.name = name; this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		
	}
	
	@Override
	public String toString() {
		return "name : "+name+", address : "+address+", phoneNumber : "+phoneNumber+", emailAddress : "+emailAddress+" ";
	}
	
}
