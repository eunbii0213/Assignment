package Assignment7_Problem1;

public class UseShape {

	public static void main(String[] args) {
		
		 
		
		/* Test 1: dx = 5, dy =5인 직사각형 
		 * 
		 * C-------D
		 * |       |
		 * A-------B   
		 * */
		
		Rectangle rectangle = new Rectangle(
				new Index(0.0,0.0), new Index(5.0,0.0), new Index(0.0,5.0),new Index(5.0,5.0));
				
		System.out.println(rectangle.getVertex());
		
		System.out.println("x를 3, y를 3만큼 이동");
		rectangle.translate(3, 3);
		System.out.println(rectangle.getVertex());
		rectangle.boundingBox();
		System.out.println(rectangle.getArea());
		
		
		
		//Test 2: 중심이 (0,8)이고 반지름이 3인 원 
		
		System.out.println("=========================");
		
		Circle circle = new Circle(new Index(0,8),3.0);
		
		System.out.println(circle.getVertex());
		
		System.out.println("x를 1, y를 2만큼 이동");
		circle.translate(1, 2);
		System.out.println(circle.getVertex());
		circle.boundingBox();
		System.out.println(circle.getArea());
		
		
		
		//Test 3:  삼각형 
		System.out.println("=========================");
		
		Triangle triangle = new Triangle(new Index(0,0),
				new Index(5,0), new Index(2,10));
		
		System.out.println(triangle.getVertex());
		
		System.out.println("x를 10, y를 20만큼 이동");
		triangle.translate(10, 20);
		System.out.println(triangle.getVertex());
		triangle.boundingBox();
		System.out.println(triangle.getArea());
		
	}

}
