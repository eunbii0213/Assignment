package Assignment9_Problem2;

public abstract class Vehicle extends Object implements Comparable{

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
		
		Vehicle compare = (Vehicle)other;
		
		if(compare.price > price) {
			//other is greater than this
			return false;
		}
		
		else if(compare.price < price) {
			//other is less than this
			return false;
		}
		
		else {
			//equal to this vehicle.
			return true;
		}
		
	}
	
	@Override
	public int compareTo(Object o) {
		
		Vehicle compare = (Vehicle)o;
		
		if(this.price > compare.price) {
			return 1;
			//내가 더 비싸다
		}
		
		else if(this.price < compare.price) {
			return -1;
			//내가 더 싸다
		}
		
		else {
			return 0;
			//같다
		}
	}
		
}
