import java.util.ArrayList;

public class p037 {

	static void generatePrimes(ArrayList<Integer> primes) {
	    int numbers[] = new int[1000000];
	    for(int i = 0; i < 1000000; i++) {
	        numbers[i] = i+1;
	    }

	    for(int i = 2; i < 1000000; i++) {
	        if (numbers[i] != 0) {
	            primes.add(i);
	            int j = i+i;

	            while (j < 1000000) {
	                numbers[j] = 0;
	                j += i;
	            }
	        }

	    }

	}

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();

	    generatePrimes(primes);

	    int length = primes.size();
	    int sum = 0;

	    for (int i = 4; i < length; i++) {
	    	int prime = primes.get(i);
	    	if (isTruncatable(prime, primes)) {
	    		sum += prime;
	    	}
	    }

	    System.out.println(sum);

	}

	private static boolean isTruncatable(int number, ArrayList<Integer> primes) {

		int tmp_number = number / 10;
		int num_ofDigits = (int) Math.log10(number) +1;

		while(tmp_number != 0) {
			if (!primes.contains(tmp_number))
				return false;
			tmp_number /= 10;
		}

		tmp_number = number;

		for(int i = 1; i < num_ofDigits; i++) {
			int prime = tmp_number % (int) Math.pow(10, i);
			if(!primes.contains(prime))
				return false;
		}

		return true;
	}

}
