package Assignment9_Problem2;

public abstract class Vehicle implements Comparable<Vehicle>{

	int price;
	
	//use the price field to determine 
	//whether one wehicle is "greater than"
	//or "less than" or "equal to" another.
	
	public abstract void move();
	

	public Vehicle(int price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object other) {
		
		//주소값까지 같은 instance인지 확인 
		if(this == other) {
			return true;
		}
		
		//아니라면 Vehicle의 instance가 맞는지 확인 
		if(!(other instanceof Vehicle)) {
			return false;
		}
		//맞다면 업캐스팅 시킴 
		Vehicle compare = (Vehicle)other;
		
		//price비교작업  
		if(compare.price == price) {
			//equal to this vehicle.
			return true;
		}
		
		
		else {
			
			return false;
		}
		
	}
	
	@Override
	public int compareTo(Vehicle o) {
		//implements<Vehicle>로 해주면 Vehicle이 아닌 객체가 들어왔을 때 오류처리 해줌!
		
		if(this.price > o.price) {
			return 1;
			//내가 더 비싸다
		}
		
		else if(this.price < o.price) {
			return -1;
			//내가 더 싸다
		}
		
		else {
			return 0;
			//같다
		}
	}
		
}
