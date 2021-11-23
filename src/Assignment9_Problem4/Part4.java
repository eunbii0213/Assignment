package Assignment9_Problem4;

import java.util.Arrays;

public class Part4 {
	
	public static int findTimes10(int[] nums) {
		
		int index=0;

		if(index >= nums.length-2) {
			return -1;
		}
		
		if(nums[index]*10==nums[index+1]) {
			return index;
			
		} else {
			
			int[] arr = Arrays.copyOfRange(nums,index,nums.length);

			return 1+ findTimes10(arr);
			 
		}

	}
	
	
	
	
}
