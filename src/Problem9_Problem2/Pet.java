package Problem9_Problem2;

public abstract class Pet implements Comparable{
	
	
	public Pet(int age) {
		this.age = age;
	}
	
	int age;
	
	public abstract void eat();
	
	@Override 
	public int compareTo(Object o) {
		
		Pet compare = (Pet)o;
		
		if(this.age > compare.age) {
			return 1;
			//내가 더 나이많당
		}
		
		else if(this.age < compare.age) {
			return -1;
			//내가 더 나이적당
		}
		
		else {
			return 0;
			//동갑이당
		}
		
	}

}
