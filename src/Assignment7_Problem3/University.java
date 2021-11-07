package Assignment7_Problem3;

public class University {

	public static void main(String[] args) {
		
		Person minyoung = new Person("조민영","울산","010-0000-0000","CuttestPrincessInTheWorld@naver.com");
	
		System.out.println(minyoung.toString());
		System.out.println();
		
		
		Student eunbii = new Student("오은비","경주","010-1111-1111","PrettySavage@naver.com",ClassStatus.SENIOR);
		System.out.println(eunbii.toString());
		System.out.println();
		
		
		Faculty profByungwook = new Faculty("김병욱","동국대","010-2222-2222","TheGreatestProfEver@naver.com","동국대",999999999,"2019.02",8,Rank.FULL_PROFESSOR);
		System.out.println(profByungwook.toString());
		System.out.println();
		
		Staff jihyeon = new Staff("김지현","독일","010-3333-3333","KimKyoungHoLover@naver.com","동국대",111111111,"2021-03","칭찬담당");
		System.out.println(jihyeon.toString());
		System.out.println();
		
		Employee jihyo = new Employee("한지효","캐나다","010-4444-4444","StrongMuscleGirl@naver.com","동국대",777777777,"2000-03");
		System.out.println(jihyo.toString());
		System.out.println();
	}

}
