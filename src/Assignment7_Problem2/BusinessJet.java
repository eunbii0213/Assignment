package Assignment7_Problem2;

public class BusinessJet extends Jet{
	
	
	private int numPassengers;//represents how many passengers the Jet can carry.
	private boolean transOceanCertified; // indicates the aircraft is certified to fly over oceans
	
	
	BusinessJet(String manufacturer, String model, int year, double grossWeightEmpty, int maxRecommendedFlightHours, int numPassengers, boolean transOceanCertified) {
		
		super(manufacturer, model, year, grossWeightEmpty, maxRecommendedFlightHours);
		
		this.numPassengers = numPassengers;
		this.transOceanCertified = transOceanCertified;
		
	}
	
	public boolean isHighClass() {
		
		if(numPassengers>40 && transOceanCertified) {
			return true;
		}
		
		else {
			
			return false;
		}
	}
	

}


class Main{
	
	public static void main(String[] args) {
		
		
		System.out.println("part 3 Test");
		
		BusinessJet jet1 = new BusinessJet( "JinAir", "이슬", 1999, 1000, 100, 250, false);
		BusinessJet jet2 = new BusinessJet( "Asiana", "공듀", 2010, 260000, 999, 500 , true);
		
		System.out.println(jet1.compareTo(jet2));
		jet1.sellTo("손이슬");
		
		
		System.out.println("점검까지: "+jet1.timeTillOverhaul());
		jet1.fly(70);
		System.out.println("70hours 비행후 점검까지 " + jet1.timeTillOverhaul()+"hours");

		System.out.println("점검필요여부: "+jet1.needsOverhaul());
		System.out.println("aging여부: "+jet1.isAging());
		System.out.println("highclass여부 : "+jet1.isHighClass());

		
		for(int i=0;i<11;i++) {
			jet1.overhaul();
		}
		
		System.out.println("여러 점검 후 aging여부: "+jet1.isAging());
		
		
		System.out.println();
		
		
		jet2.sellTo("민영");
		jet2.overhaul();
		
		System.out.println("점검까지: "+jet2.timeTillOverhaul());
		jet2.fly(1);
		System.out.println("1hours 비행후 점검까지 " + jet2.timeTillOverhaul()+"hours");

		System.out.println("점검필요여부: "+jet2.needsOverhaul());
		System.out.println("aging여부: "+jet2.isAging());
		System.out.println("highclass여부 : "+jet2.isHighClass());


	}

	
}
