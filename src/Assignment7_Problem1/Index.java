package Assignment7_Problem1;

public class Index {
	
	public double x;
	public double y;
	
	Index(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public String indexPrint() {
		return ("("+x+","+y+")");
	}
}
