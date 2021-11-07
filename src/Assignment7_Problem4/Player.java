package Assignment7_Problem4;

public class Player {
	String name;
	Position position;
	
	public Player(String name, Position position) {
		
		this.name = name;
		this.position = position;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		//이 메소드 쓰기
		return name+": "+position;
	}
	
}
