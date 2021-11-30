package Assignment9_Problem4;

public class Part5 {
	
	static int index=0;

	public  void replaceMult5(int[] nums, int newVal) {
		
		if(index>=nums.length) {
			
			return;
		}
		
		if(nums[index]%5==0) {
			nums[index]=newVal;
			System.out.print(nums[index]+" ");
			index++;
			replaceMult5(nums,newVal);
		}else {
			System.out.print(nums[index]+" ");
			index++;
			replaceMult5(nums,newVal);
		}
	}
}
