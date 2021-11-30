package Assignment9_Problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FractionCalculator {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter a math problem containing fractions: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		StringTokenizer st = new StringTokenizer(input,"+-/* ",true);
		
		
		String[] strArr = new String[input.length()];
		
		for(int i=0;st.hasMoreElements();i++) {
			strArr[i]= st.nextToken();
			System.out.print(strArr[i]);
		}
		
		int[] result = new int[3];
		
		

		
		if(strArr[4].equals("+") || strArr[4].equals("-")) {
			result[0]=(Integer.parseInt(strArr[0])*(Integer.parseInt(strArr[strArr.length-1])));
			result[1]=(Integer.parseInt(strArr[2]))*(Integer.parseInt(strArr[strArr.length-1]));
			
			result[2]=(Integer.parseInt(strArr[6]))*(Integer.parseInt(strArr[2]));
			
			

			
			if(strArr[4].equals("+")) {
				System.out.println(" = "+(result[0]+result[2])+"/"+result[1]);
			}
			
			else {
				System.out.println(" = "+(result[0]-result[2])+"/"+result[1]);
			}
			
		}
		
		else if(strArr[4].equals("*")) {
			result[0]=(Integer.parseInt(strArr[0])*(Integer.parseInt(strArr[6])));
			result[1]=(Integer.parseInt(strArr[2]))*(Integer.parseInt(strArr[strArr.length-1]));
			System.out.println(" = "+(result[0])+"/"+result[1]);
			
			
		}
		
		else {
			result[0]=(Integer.parseInt(strArr[0])*(Integer.parseInt(strArr[strArr.length-1])));
			result[1]=(Integer.parseInt(strArr[2]))*(Integer.parseInt(strArr[6]));
			System.out.println(" = "+(result[0])+"/"+result[1]);
			
		}
		
		
			

	}

}
