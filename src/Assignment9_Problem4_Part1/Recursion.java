package Assignment9_Problem4_Part1;
import java.util.*;
import java.util.ArrayList;

public class Recursion {
	
	
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public  void reverseDisplay(int value) {
		
		if(value>0) {
			
			System.out.print(value%10); 
			reverseDisplay(value/10);
			
			
		}
		
		
		
	}
}
