package Assignment9_Problem4;

public class Part7 {
	
	public int teddy(int initial, int goal, int increment, int count) {
		
		count++;
		
		int result=10;
		
		if(count>=10) {
			return -1;
		} else if(initial == goal) {
			return count;
		} else {
			
			int case1 = teddy(initial+=(initial/2),goal,increment,count);
			int case2 = teddy(initial+=increment,goal,increment,count);
			int case3 = teddy(initial-=(initial/2),goal,increment,count);
			int case4 = teddy(initial-=increment,goal,increment,count);
			
			count = Math.min(case1, case2);
			count = Math.min(result, case3);
			count = Math.min(result, case4);
			
//			if(case1>=0) {
//				if(case2>=0) {
//					count = Math.min(case1, case2);
//					
//				}else {
//					count = case1;
//					
//				}
//			}
//			
//			if(case2>=0) {
//				if(case1>=0) {
//					count = Math.min(case1, case2);
//					
//				}else {
//					count = case2;
//					
//				}
//			}
//			
//			if(case3>=0) {
//				if(case4>=0) {
//					count = Math.min(result, case3);
//					count = Math.min(result, case4);
//					
//				}else {
//					count = Math.min(result, case3);
//					
//				}
//			}
//			
//			if(case4>=0) {
//				if(case3>=0) {
//					count = Math.min(result, case3);
//					count = Math.min(result, case4);
//					
//				}else {
//					count = Math.min(result, case4);
//					
//				}
//			}
			
			//System.out.println(result);
		
			return count;
		}
		
		
		
	}

	public int teddy(int initial, int goal, int increment) {
		

		return teddy(initial,goal,increment,-1);
		
		
		
	 }
}
