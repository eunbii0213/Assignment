package Assignment5;

public class Test {

	public static void main(String[] args) {
		

		Eunbii eunbii = new Eunbii(1,"오은비","학생",23);
		Dohan dohan = new Dohan(2,"정도한","개발자",35);
		Minji minji = new Minji(3,"김민지","학생",22);
	

		
		//test 1: vip고객(dohan)님과 일반 고객의 결제금액 차이 출력

		System.out.println();
		
		
		System.out.println("test 1: vip고객(dohan)님과 일반 고객의 결제금액 차이 출력");
		eunbii.setBalance(1000000);
		eunbii.pay(500000);
		System.out.println(eunbii.getBalance());
		
		dohan.setBalance(1000000);
		dohan.pay(500000);
		System.out.println(dohan.getBalance());
		
		
		
		
		//test 2 : 결제 금액에 따른 tier변화 출력
		
		System.out.println();
		System.out.println("test 2 : 결제 금액에 따른 tier변화 출력");
		System.out.println(dohan.getTier());
		dohan.pay(10000000);
		
		System.out.println("10000000원 지불 후 ");
		
		System.out.println(dohan.getTier());
		
		
		
		
		//test 3: 고객 정보 출력 
		
		System.out.println();
		
		System.out.println("test 3: 고객 정보 출력");
		
		eunbii.printCustomerInfo();
		eunbii.printCustomerCardInfo();
		System.out.println();
		

		dohan.printCustomerInfo();
		dohan.printCustomerCardInfo();
		System.out.println();
		
		
		minji.printCustomerInfo();
		minji.printCustomerCardInfo();
		
		
		
		//test 4: 티어에 따른 포인트 적립률 확인
		
		System.out.println();
		
		System.out.println("test 4: 티어에 따른 포인트 적립률 확인");
		
		
		//silver의 포인트 적립 
		eunbii.setZeroPoint();
		eunbii.pay(10000);
		System.out.println("silver의 포인트 적립 "+" "+eunbii.getPoint());

		
		//platinum의 포인트 적립
		dohan.setZeroPoint();
		dohan.pay(10000);
		System.out.println("platinum의 포인트 적립 "+" "+dohan.getPoint());
		
		
			
		//iron의 포인트 적립
		minji.setZeroPoint();
		minji.pay(10000);
		System.out.println("iron의 포인트 적립 "+" "+minji.getPoint());
		
	

	}

}
