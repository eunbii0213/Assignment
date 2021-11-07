package Assignment7_Problem1;

public class Triangle implements Shape{

	
	/*
	 *    C
	 *    
	 * A     B
	 *
	 * */
	
	private Index A;
	private Index B;
	private Index C;
	
	
	Triangle(Index A, Index B, Index C){
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	
	
	@Override
	public void translate(double dx, double dy) {
		
		A.x += dx;
		B.x += dx;
		C.x += dx;
		
		A.y += dy;
		B.y += dy;
		C.y += dy;
		
	}

	@Override
	public void scale(double factor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Box boundingBox() {
		Box box = new Box(A,B,new Index(A.x,C.y), new Index(B.x,C.y));
		return box;
	}

	@Override
	public String getVertex() {
		
		
		return "이 삼각형의 각 점은 "+A.indexPrint()+
				","+B.indexPrint()+","+C.indexPrint()+"\n";
		
	}

	@Override
	public String getArea() {
		
		double height = C.y-A.y;
		double dx = B.x-A.x;
		
		return "이 삼각형의 면적은 "+height*dx+"\n";
		
	}

	

	

}
