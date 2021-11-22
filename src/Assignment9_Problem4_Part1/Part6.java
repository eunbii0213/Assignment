package Assignment9_Problem4_Part1;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Part6 {
	
	static String[] strArr;
	
	static int count=0;
	static int index=-1;
	static String s1Str="";
	static String s2Str="";
	

	public String[] mobius(String s1, String s2) {
		StringTokenizer st ;
		
		String str = s1.concat(s2);
		
		String[] str1 = s1.split("");
		String[] str2 = s2.split("");
		
		
		if(count==0) {
			
			System.out.println(str);
			count++;index++;
			return mobius(s1,s2);
		}
		
		else if(count!=0 && count < str1.length) {
			
			String leftStr = s1;
			leftStr=leftStr.substring(index+1,s1.length());
			s1Str+=str1[index];
			
			System.out.println(leftStr+s2+s1Str);
			count++;index++;
			
			if(index==s1.length()-1) {
				index=0;
				System.out.println(s2+s1);
			}
			
			return mobius(s1,s2);
			
			
		}
		

		if( count >= str1.length && count<(str1.length+str2.length)) {
			
			String rightStr = s2;
			rightStr=rightStr.substring(index+1,s2.length());
			s2Str+=str2[index];
			
			System.out.println(rightStr+s1+s2Str);
			count++;index++;
			
			return mobius(s1,s2);
		}
		
		
		else {
			String[] done = {" "};
			return (done);
		}
		
	}
	
	
	
}
