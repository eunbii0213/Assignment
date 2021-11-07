package Assignment5;


final class Dohan extends Card{
	
	private boolean Vip; //vip고객여부. vip는 결제시 할인기능 추가됨
	
	
	public Dohan(int serialNum, String name, String job,int age) {
		
		super(serialNum, name, job, age);

		//도한 고객님은 vip ^ㅅ^!
		setVip(true);
		
	}

	//vip고객은 결제때 마다 0.5%의 할인이 들어감
	@Override
	public void pay(int price) {
		
		int discount = (int) (price*0.005);
		int resultPrice = price - discount;
		
		int balance = getBalance();
		balance-=resultPrice;
		
		setBalance(balance);
		setTotal(resultPrice);
		
		//total 금액 변동될 때 마다 티어+적립률, nextTier 갱신 
		setTier(); calculateForNextTierPayment();
		
		//포인트 적립은 원가로 
		setPoint(price);
		
		
	}
	

	public boolean isVip() {
		return Vip;
	}


	public void setVip(boolean vip) {
		Vip = vip;
	}

	public void setZeroPoint() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
