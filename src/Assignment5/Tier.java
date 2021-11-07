package Assignment5;

public enum Tier {
	IRON(200000),
	BRONZE(500000),
	SILVER(1000000),
	GOLD(1500000),
	PLATINUM(0);
	
	int upgradePayment;
	
	Tier(int upgradePayment){
		this.upgradePayment = upgradePayment;
	}
	
	public int getUpgradePayment() {
		return upgradePayment;
	}
}
