package Assignment7_Problem3;

public enum ClassStatus {

	FRESHMAN(1),SOPHOMORE(2),
	JUNIOR(3),SENIOR(4);
	
	int value;
	
	ClassStatus(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
}
