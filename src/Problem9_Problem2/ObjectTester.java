package Problem9_Problem2;

public class ObjectTester {

	public static void main(String[] args) {
		
		//Pet 클래스인데 Cat의 생성자이용??
		//고양이 냠냠출력
		//질문 >> Cat p1 = new Cat(5);와 무슨차이인가요?
		Pet p1 = new Cat(5);
		p1.eat();
		
		//고양이 : 애옹 출력
		((Cat)p1).makeNoise();
		
		//물고기 : 냠냠 출력
		Pet p2 = new Fish(4);
		p2.eat();
		
		//price 1200의 ship 객체만듬
		Vehicle v = new Ship(1200);
		
		//ship : 출발 출력
		v.move();
		//ship : 출발 출력
		((Boat)v).move();
		//ship : 닻 내려간당 출력
		((Ship)v).dropAnchor();
		
		Taxi t = new Taxi(1800);
		t.makeNoise();
		t.move();
		
		//고양이: 애옹 출력 
		NoiseMaker n1 = new Cat(3);
		n1.makeNoise();
		
		//택시 : 빵빵 출력
		NoiseMaker n2 = new Taxi(500);
		n2.makeNoise();
		
		System.out.println(p1.compareTo(p2));
		//System.out.println(v.compareTo(t));
		System.out.println(v.equals(t));
		
		//System.out.println(t.compareTo(p1);
		//>> p1은 pet이라 age변수가지고 t는 vehicle이라 price가짐!
		//>>애초에 비교대상이랑 class가 달라서 error.
		
		//Cat c = p1;
		//Noisemaker n3 = p1; 
		

	}

}
