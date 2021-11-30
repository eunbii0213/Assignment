package Assignment9_Problem4;

import java.util.Arrays;

public class Part4 {
	
	public static int findTimes10(int[] nums, int low) {
        if (low + 1 >= nums.length) {
            return -1;
        }

        if (nums[low] * 10 == nums[low + 1]) {
            return low;
        } else {
            return findTimes10(nums, low + 1);
        }
    }

    public static int findTimes10(int[] nums) {
        return findTimes10(nums, 0);
    }
}