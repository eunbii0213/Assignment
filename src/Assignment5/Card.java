package Assignment5;


public class Card {
	
	private final int SERIAL_NUM;
	
	private int age; //고객의 나이 
	private String name; //고객의 이름
	private String job; //고객의 직업
	private Tier tier; //고객의 티어
	
	private int balance;
	private int totalPayment; //고객의 실적 
	private int point; //포인트(티어별로 다르게 적립)
	private int forNextTierPayment; //다음 티어로 가기 위해 필요한 금액 
	
	
	public Card(int serialNum, String name, String job,int age){
		
		this.SERIAL_NUM = serialNum;
		this.name = name;
		this.job = job;
		this.age = age;
		
		tier = Tier.IRON;
		totalPayment = 0;
		point = 0;
		forNextTierPayment = 200000;
		balance = 0;
		

	}


	final public void printCustomerInfo() {
		System.out.println( "이름 : " + getName() + ", 나이 : "+getAge()+", 직업 : "+ getJob() );
	}
	
	final public void printCustomerCardInfo() {
		System.out.println( " 일련 번호 : " + getSERIAL_NUM() + ", 등급 : "+ getTier() + ", 잔고 : "+ getBalance() +", 포인트 : "+ getPoint() +", 다음 등급까지 : "+ getForNextTierPayment() );
	}
	
	public void pay(int price) {
		
		this.balance -= price;
		totalPayment+=price;
		
		setPoint(price);

		
	}
	
	public void take(int price) {
		this.balance += price;
	}
	


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public int getForNextTierPayment() {
		return forNextTierPayment;
	}


	public void setForNextTierPayment(int forNextTierPayment) {
		this.forNextTierPayment = forNextTierPayment;
	}


	public int getAge() {
		return age;
	}


	public String getName() {
		return name;
	}


	public String getJob() {
		return job;
	}


	public void setAge(int age) {
		this.age = age;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setJob(String job) {
		this.job = job;
	}



	public void setTier() {
		
		if(totalPayment<Tier.IRON.getUpgradePayment()) {
			tier = tier.IRON;
		}//실적이 20만원 이하>> 아이언 
		
		else if(totalPayment>=Tier.IRON.getUpgradePayment() && totalPayment<tier.BRONZE.getUpgradePayment()) {
			tier = tier.BRONZE;
		}//실적이 20만원이상, 50만원 이하>> 브론즈 
		
		
		else if(totalPayment>=Tier.BRONZE.getUpgradePayment() && totalPayment<tier.SILVER.getUpgradePayment()) {
			tier = tier.SILVER;
		}//실적이 50만원이상, 100만원 이하>> 실버
		
		else if(totalPayment>Tier.SILVER.getUpgradePayment() && totalPayment<tier.GOLD.getUpgradePayment()) {
			tier = tier.GOLD;
		}//실적이 100만원 이상, 150만원 이하>> 골드
		
		else {
			tier = Tier.PLATINUM;
		}//실적이 150만원 이상>> 플레티넘 
		
		
		
		
	}


	public int getTotalPayment() {
		return totalPayment;
	}


	public void setTotal(int price) {
		this.totalPayment+= price;
	}


	public int getPoint() {
		return point;
	}
	
	
	//포인트 초기화 
	public void initializePoint() {
		this.point = 0;
	}
	
	public void setPoint(int price) {
		
		//totalPayment 금액 변동될 때 마다 티어+적립률, nextTier 갱신 
		setTier(); calculateForNextTierPayment();
		
		this.point = calculatePoint(price);
		
	}


	public int calculatePoint(int price) {
		
		if(this.tier == Tier.IRON) {
			return point+=(price*0.001);
		}//등급이 아이언 >> 0.1%적립 
		
		else if(this.tier == Tier.BRONZE) {
			return point+=(price*0.003);
		}//등급이 브론즈 >> 0.3%적립 
		
		else if(this.tier == Tier.SILVER) {
			return point+=(price*0.005);
		}//등급이 실버 >> 0.5%적립 
		
		else if(this.tier == Tier.GOLD) {
			return point+=(price*0.007);
		}//등급이 골드 >> 0.7%적립 
		
		else {
			return point+=(price*0.009);
		}//등급이 플레티넘 >> 0.9%적립 
		
		
	}


	public void printForNextTierPayment() {
		
		printTIER_ARR();
		
		System.out.println("고객님은 "+getTier()+"등급이며 다음 등급까지는 "+getForNextTierPayment()+"만큼의 실적이 필요합니다");
		
	}




	public void setTier(Tier tier) {
		this.tier = tier;
	}
	
	public Tier getTier() {
		return tier;
	}



	public void calculateForNextTierPayment() {
		
		if(tier == Tier.IRON) {
			forNextTierPayment = tier.IRON.getUpgradePayment()-totalPayment;
		}
		
		else if(tier == Tier.BRONZE) {
			
			forNextTierPayment = tier.BRONZE.getUpgradePayment()-totalPayment;
		}
		
		
		else if(tier ==Tier.SILVER) {
			
			forNextTierPayment = tier.SILVER.getUpgradePayment()-totalPayment;
		}
		
		else if(tier == Tier.GOLD) {
		
			forNextTierPayment = Tier.GOLD.getUpgradePayment()-totalPayment;
		}
		
		else {
			
			forNextTierPayment=0;
		}
	}


	public int getSERIAL_NUM() {
		return SERIAL_NUM;
	}


	public void printTIER_ARR() {
		System.out.print("등급은 ");
		
		System.out.print("IRON, BRONZE, SILVER, GOLD, PLATINUM");
		
		System.out.print("가 있습니다 ");
	}


}

