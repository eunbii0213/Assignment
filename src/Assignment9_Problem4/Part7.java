package Assignment9_Problem4;

public class Part7 {
	
	 private int teddy(int initial, int goal, int increment, int count) {
	        if (count > 10) {
	            return Integer.MAX_VALUE;
	        } else if (initial == goal) {
	            return count;
	        }

	        int case1 = initial % 2 == 0 ? teddy(initial + initial / 2, goal, increment, count + 1) : Integer.MAX_VALUE;
	        int case2 = teddy(initial + increment, goal, increment, count + 1);
	        int case3 = initial % 2 == 0 ? teddy(initial - initial / 2, goal, increment, count + 1) : Integer.MAX_VALUE;
	        int case4 = teddy(initial - increment, goal, increment, count + 1);

	        return Math.min(case1, Math.min(case2, Math.min(case3, case4)));
	    }

	    public int teddy(int initial, int goal, int increment) {
	        int count = teddy(initial, goal, increment, 0);
	        return count > 10 ? -1 : count;
	    }
	}