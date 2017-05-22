
public class p047 {
	static final int N = 100000, n = 10000;
	
	static void generatePrimes(int primes[]) {
	    int numbers[] = new int[N];
	    for(int i = 0; i < N; i++) {
	        numbers[i] = i+1;
	    }

	    int k = 0;

	    for(int i = 2; i < N && k < n; i++) {
	        if (numbers[i] != 0) {
	            primes[k++] = i;
	            int j = i+i;

	            while (j < N) {
	                numbers[j] = 0;
	                j += i;
	            }
	        }

	    }

	}

	static int number_of_prime_factors(int number, int primes[]) {
	    int upper = number / 2;
	    int count = 0, tmp_number;
	    int i;
	    for(i = 0; primes[i] <= upper; i++) {
	        tmp_number = number;
	        if(tmp_number % primes[i] == 0) {
	            count++;
	        }
	    }
	    return count;
	}

	public static void main(String[] args) {

	    int primes[] = new int[n];

	    generatePrimes(primes);
	    
	    int count = 0, number = 2;
	    
	    while (count < 4) {
	    	if (number_of_prime_factors(number++, primes) == 4)
	    		count++;
	    	else
	    		count = 0;
	    }
	    
	    System.out.println(number - 4);

	}

}
