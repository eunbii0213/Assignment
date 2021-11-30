package Assignment9_Problem4;

public class Part2 {
	

		//n이 짝수 >> 2로나눔
		//n이 홀수 >> 3으로 나누고 1더함
		
		public  int hailstone(int n) {
			
			
			
			if(n==1) {
				
				return 1;
			}
			
			else {
				
				System.out.print(n+",");
				
				if(n%2==0) {
					n/=2;
				}
				
				else {
					n*=3;
					n++;
				}
				
				return hailstone(n);
			}
		}
}



