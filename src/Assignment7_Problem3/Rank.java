package Assignment7_Problem3;

public enum Rank {
	
LECTURER(1),ASSISTANT_PROFESSOR(2),
FULL_PROFESSOR(3),ASSOCIATE_PROFESSOR(4);
	
	int value;
	
	Rank(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

}
