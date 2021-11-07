package Assignment7_Problem1;

public class Rectangle implements Shape{
	
	//직사각형 
	
	private Index A;
	private Index B;
	private Index C;
	private Index D;
	
	//좌표상의 점 A,B,C,D 
	Rectangle(Index A, Index B, Index C, Index D){
		
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
		
	}


	@Override
	public void translate(double dx, double dy) {
		
		//x를 dx방향으로, y를 dy방향으로 이동
		
		this.A.x += dx;
		this.B.x += dx;
		this.C.x += dx;
		this.D.x += dx;
		
		
		this.A.y += dy;
		this.B.y += dy;
		this.C.y += dy;
		this.D.y += dy;
		
		
	}

	@Override
	public void scale(double factor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Box boundingBox() {
		Box box = new Box(A,B,C,D);
		
		return box;
	}
	
	
	@Override
	public String getVertex() {
		

		return "이 직사각형의 각 점은 "+A.indexPrint()+
				","+B.indexPrint()+","+C.indexPrint()+D.indexPrint()+"\n";
	}

	

	@Override
	public String getArea() {
		
		double maxDx;
		double maxDy;
		
		maxDx = Math.max(B.x, D.x);
		maxDy = Math.max(C.y, D.y);
	
		
		return ("직사각형의 넓이는 "+maxDy*maxDx);
		
	}


	

	

}
