package Assignment9_Problem4_Part1;

public class Part3 {
	
	static int  A = 65;
	static char[] arr;
	static int count=0;
	static int upperCase =0;
	
	public int count(String str) {
		
		arr = str.toCharArray();
		
		if(count==str.length()) {
			
			return upperCase;
		}
		
		
		if(arr[count]==(A)) {
			
			upperCase++;
			count++;
			A=65;
			return count(str);
		}
		
		else if(A>91) {
			
			A=65;count++;
			return count(str);
			
		}
		
		else {
			
			A++;
			return count(str);
			
		}
		
	}
	
	//public static int count(String str, int high) {}
}
