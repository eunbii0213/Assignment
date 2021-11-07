package Assignment7_Problem1;

public class Box {
	
	
	
	/* 
	 * C-------D
	 * |       |
	 * A-------B   
	 */
	
	private Index A;
	private Index B;
	private Index C;
	private Index D;
	
	
	
	Box(Index A, Index B, Index C, Index D){
		
		
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
		
		
		double dx = B.x - A.x;
		double dy = D.y - B.y;
		
		System.out.println("boundingBox의 넓이는 "+dx*dy);

	}
	
	
	
	
	
	

}
