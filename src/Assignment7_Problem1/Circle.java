package Assignment7_Problem1;

public class Circle implements Shape{
	
	//직사각형 
	
	private Index center;
	private double radius;
	public final double PI = 3.141592;
	
	Circle(Index center, double radius){
		
		this.center = center;
		this.radius = radius; 
	}
	
	

	@Override
	public void translate(double dx, double dy) {
		center.x += dx;
		center.y += dy;
		
	}

	@Override
	public void scale(double factor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Box boundingBox() {
		
		Box box = new Box(new Index(center.x-radius,center.y-radius),
				new Index(center.x+radius,center.y-radius),
				new Index(center.x-radius,center.y+radius),
				new Index(center.x+radius,center.y+radius));
			
		
		return box;
	}


	
	@Override
	public String getVertex() {
	
		return "원의 중심은 "+center.indexPrint()+"반지름은 "+radius+"\n";
		
	}

	@Override
	public String getArea() {
		return ("원의 넓이는 "+radius*radius*PI+"\n");
		
	}
	
	

}
