
public class p028 {
	public static void main(String[] args) {
		int sum = 1;
	    int i = 1;
	    int inc = 0;

	    while (i <= 1002001) {
	    	inc += 2;
	    	for(int j = 1; j <= 4; j++) {
	    		i += inc;
	    		sum += i;
	    		if (i == 1002001) {
	    			System.out.println(sum);
	    			return;
	    		}
	    	}
	    }
	}
}
