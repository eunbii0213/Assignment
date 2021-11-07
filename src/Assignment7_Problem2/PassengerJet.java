package Assignment7_Problem2;

public class PassengerJet extends Jet{
	
	
	private int numPassenger;//비행기안에 탑승할 수 있는 최대 승객 수
	private int numEngines;//비행기가 가지고있는 엔진 개수
	private boolean hasAutopilot;//비행기가 완전한 자동장치기능을 가지고있는지


	PassengerJet(String manufacturer, String model, int year, double grossWeightEmpty, int maxRecommendedFlightHours, int numPassengers, int numEngines, boolean hasAutopilot) {
		
		super(manufacturer, model, year, grossWeightEmpty, maxRecommendedFlightHours);
		
		this.numPassenger = numPassengers;
		this.numEngines = numEngines;
		this.hasAutopilot = hasAutopilot;
	}
	
	
	
	//resets the hours since last overhaul when called.
	@Override	
	public void overhaul() {
		super.lastOverhaul=0;
		super.numOverhauls+=numEngines;
	}
	
	
	
	//The jet is hard to fly if there is no autopilot.
	public boolean isHardToFly() {
	
		if(!hasAutopilot) {
			return false;
		}
		
		else {
			return true;
		}
		
	}
	
	//This returns true if the grossWeightEmpty is greater than 230,000 kilograms.
	public boolean needsLongRunway() {
		if(super.grossWeightEmpty>230000) {
			return true;
		}
		
		else {
			return false;
		}
	}

}


class Main{
	
	public static void main(String[] args) {
		
		
		System.out.println("part 2 Test");
		
		PassengerJet jet1 = new PassengerJet( "JinAir", "민영", 1999, 1000, 100, 250, 2, false);
		PassengerJet jet2 = new PassengerJet( "Asiana", "공듀", 2010, 260000, 999, 500, 4, true);
		
		System.out.println(jet1.compareTo(jet2));
		jet1.sellTo("조민영");
		
		
		System.out.println("점검까지: "+jet1.timeTillOverhaul());
		jet1.fly(70);
		System.out.println("70hours 비행후 점검까지 " + jet1.timeTillOverhaul()+"hours");

		System.out.println("점검필요여부: "+jet1.needsOverhaul());
		System.out.println("aging여부: "+jet1.isAging());
		System.out.println("autopilot여부: "+jet1.isHardToFly());
		System.out.println("무게 25000이상? : "+jet1.needsLongRunway());
		
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
		System.out.println("autopilot여부: "+jet2.isHardToFly());
		System.out.println("무게 250000이상? : "+jet2.needsLongRunway());
		
		
		
	}

	
}
