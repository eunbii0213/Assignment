package Assignment9_Problem2;

public class ObjectTester {

	public static void main(String[] args) {
		
		
		//고양이 냠냠출력
		//업캐스팅! 
		//Cat은 Pet의 서브클래스 >> Pet의 eat()은 추상메서드
		//따라서 eat()을 구현한 Cat의 eat()에 접근하여 고양이:애옹출력
		Pet p1 = new Cat(5);
		p1.eat();
		
		//고양이 : 애옹 출력
		//다운캐스팅
		//Pet()에는 makeNoise()가 없기때문에 접근하려면 다운캐스팅 필요
		((Cat)p1).makeNoise();
		
		//물고기 : 냠냠 출력
		Pet p2 = new Fish(4);
		p2.eat();
		
		//price 1200의 Vehicle class type으로 업캐스팅(객체는 ship클래스 가리킴) 
		Vehicle v = new Ship(1200);
		
		//ship : 출발 출력
		v.move();
		
		//ship : 출발 출력
		//보트이긴 보트인데 ship instance기때문에 ship.move() 실행 
		//Boat는 ship의 슈퍼클래스 >> ship에 move()를 override했으니 자식클래스의 move()가 호출됨 
		((Boat)v).move();
		
		
		//ship : 닻 내려간당 출력
		((Ship)v).dropAnchor();
		
		
		Taxi t = new Taxi(1800);
		t.makeNoise();
		t.move();
		
		//고양이: 애옹 출력 
		//업캐스팅. 인터페이스를 구현하는 클래스는 인터페이스로 업캐스팅가능
		NoiseMaker n1 = new Cat(3);
		n1.makeNoise();
		
		//택시 : 빵빵 출력
		NoiseMaker n2 = new Taxi(500);
		n2.makeNoise();
		
		System.out.println(p1.compareTo(p2));
		
		System.out.println(v.compareTo(t));
		//>>Vehicle class v와 Taxi t를비교 >> 
		//Taxi class는 equals()안에서 Vehicle로 업캐스팅됨 
		//객체 v의 price와 t의 price비교해서 -1 or 1 or 0을 return 
		
		System.out.println(v.equals(t));
		
		//System.out.println(t.compareTo(p1));
		//타입이 다르기 때문에 업캐스팅 할 수 없어서 error. 
		
		//Cat c = p1; >> 다운캐스팅은 생략불가. Cat c = (Cat)p1;해줘야함
		//Noisemaker n3 = p1; >>Pet은 Noisemaker구현한 class가 아니라서 업캐스팅 불가 
		

	}

}
