package Assignment9_Problem4;

public class UseRecursion {

	public static void main(String[] args) {
		
		System.out.println("part1 >>"); 
		Recursion recursion = new Recursion();
		recursion.reverseDisplay(12345);
		System.out.println("\n"); 
		
		System.out.println("part2 >>"); 
		Part2 hailStone = new Part2();
		System.out.println(hailStone.hailstone(5)+"\n");
		
		System.out.println("part3 >>"); 
		Part3 count = new Part3();
		System.out.println(count.count("Stony Brook")+"\n");
		
		System.out.println("part4 >>"); 
		Part4 multiple = new Part4();
		System.out.println(multiple.findTimes10(new int[]{1,5,3,5,50,2,4,6,60})+"\n");
		
		System.out.println("part5 >>"); 
		Part5 replace = new Part5();
		replace.replaceMult5(new int[]{5,3,5,50,2,4,6,60}, 77);
		System.out.println("\n"); 
		
		System.out.println("part6 >>"); 
		Part6 mobius = new Part6();
		mobius.mobius("Hello","Java");
		System.out.println("\n"); 
		
		System.out.println("part7 >>");
		Part7 teddybear = new Part7();
		System.out.println(teddybear.teddy(10, 4, 2));
		
	}

}
