package Assignment9_Problem4;

public class Part7 {
	
	static int count=0;

	public int teddy(int initial, int goal, int increment) {
		
		count++;
		
		if(count>=10) {
			return -1;
		}
		
		else if(initial == goal) {
			return count;
		}
		
		
		else{
			
			if(initial<goal) {
				
				if(initial % 2 == 0) {
				
					teddy(initial+=(initial/2),goal,increment);
						
				} else {
				
					teddy(initial+=increment,goal,increment);
				}
			} else {
				
				if(initial % 2 == 0) {
					
					 teddy(initial-=(initial/2),goal,increment);

				}else {
				
					teddy(initial-=increment,goal,increment);
				}
				
			}

		}
		
		return count;

	 }
}
