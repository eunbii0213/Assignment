package Assignment9_Problem4;

public class Part3 {

	 public static int count(String str) {
	        return count(str, str.length() - 1);
	    }

	    public static int count(String str, int high) {
	        if (high < 0) {
	            return 0;
	        }

	        char c = str.charAt(high);
	        int cnt = 0;
	        if (c >= 'A' && c <= 'Z') {
	            cnt = 1;
	        }
	        return cnt + count(str, high - 1);
	    }
	}
