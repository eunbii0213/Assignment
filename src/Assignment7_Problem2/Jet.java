package Assignment7_Problem2;

public class Jet implements Comparable<Jet> {
	
	private String manufacturer; //제조사
	private String model; //모델명
	private int year; //제조년도
	private int age; //비행기 연식
	private String owner; //주인
	protected double grossWeightEmpty; //비행기 무게(kg)
	protected int lastOverhaul;//마지막 점검 이후 비행시간
	protected int numOverhauls;//점검 받은 수
	protected int maxRecommendedFlightHours;//점검전 권장 비행시간
	
	
	

	Jet(String manufacturer, String model, int year, double grossWeightEmpty, int maxRecommendedFlightHours){
		
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
		this.age = 2020-year+1;
		this.grossWeightEmpty = grossWeightEmpty;
		this.lastOverhaul = 0;
		this.numOverhauls =0;
		this.maxRecommendedFlightHours = maxRecommendedFlightHours;
		
	}
	
	
	//name of the new owner of the jet.
	//selled a jet 
	public  void sellTo(String name) {
		this.owner = name;
	}
	
	//resets the hours since last overhaul when called.
	public void overhaul() {
		this.lastOverhaul=0;
		
	}
	
	// This returns the number of flight hours left before reaching the maximum hoursbefore overhauling the engines.
	public int timeTillOverhaul() {
		
		return this.maxRecommendedFlightHours-this.lastOverhaul;
	}
	
	// an integer number of hours that the plane has flown for a particular day.
	public void fly(int hour) {
		this.lastOverhaul+=hour;
	}
	
	//It should be true if the amount of flight hours is within 100 hours
	//of the maximum recommended flight hours between overhauls.
	public boolean needsOverhaul() {
		
		if(this.maxRecommendedFlightHours-this.lastOverhaul<100) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	//True if the Jet is more than 15 years old and has had 20 or more overhauls.
	public  boolean isAging() {
		
		if(this.age>15 && this.numOverhauls>20) {
			return true;
		}
		
		else {
			return false;
		}
		
	}
	
	public int getNumOverhauls() {
		return numOverhauls;
	}


	public void setNumOverhauls(int numOverhauls) {
		this.numOverhauls = numOverhauls;
	}

	
	//최신 모델일수록 더 좋다는 기준으로
	
	@Override
	public int compareTo(Jet anotherJet) {
		
		int v1 = this.year;
		int v2 = anotherJet.year;
		
		return (v1 < v2 ? -1 : (v1 == v2 ? 0 : 1 ));
		
	}
	

}


class Main{
	
	public static void main(String[] args) {
		
		
		System.out.println("part 1 Test");
		
		Jet jet1 = new Jet( "JinAir", "은비행기", 1999, 1000, 100);
		Jet jet2 = new Jet( "Asiana", "동비행기", 2010, 1000, 999);
		
		System.out.println(jet1.compareTo(jet2));
		jet1.sellTo("은비");
		
		
		System.out.println("점검까지: "+jet1.timeTillOverhaul());
		jet1.fly(70);
		System.out.println("70hours 비행후 점검까지 " + jet1.timeTillOverhaul()+"hours");

		System.out.println("점검필요여부: "+jet1.needsOverhaul());
		System.out.println("aging여부: "+jet1.isAging());
		
		for(int i=0;i<25;i++) {
			jet1.setNumOverhauls(25);
		}
		
		System.out.println("25번의 점검 후 aging여부: "+jet1.isAging());
		
		
		System.out.println();
		
		
		jet2.sellTo("민영");
		jet2.overhaul();
		
		System.out.println("점검까지: "+jet2.timeTillOverhaul());
		jet2.fly(1);
		System.out.println("1hours 비행후 점검까지 " + jet2.timeTillOverhaul()+"hours");

		System.out.println("점검필요여부: "+jet2.needsOverhaul());
		System.out.println("aging여부: "+jet2.isAging());
		
		
		
		

		
	}

	
}
