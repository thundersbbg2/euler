import java.util.ArrayList;
import java.util.Arrays;

public class p035 {
	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		boolean numbers[] = new boolean[1000000];
		ArrayList<Integer> primes = new ArrayList<Integer>();

		for (int i = 0; i < 1000000; i++)
			numbers[i] = true;

		for (int i = 2; i < 1000000; i++) {
			if (numbers[i]) {
				primes.add(i);
				int j = i + i;
				while (j < 1000000) {
					numbers[j] = false;
					j += i;
				}
			}
		}

		int i = 4;
		while (i < primes.size()) {
			int tmp_num = primes.get(i);

			boolean control = true;
			while (control) {
				if ((tmp_num % 10) % 2 == 0 || tmp_num % 10 == 5) {
					control = false;
					primes.remove(i);
				}

				if (control) {
					tmp_num /= 10;
					if (tmp_num == 0)
						control = false;
				}
			}

			if (tmp_num == 0)
				i++;
		}

		int primesElected[] = new int[primes.size()];

		for (i = 0; i < primes.size(); i++) {
			primesElected[i] = primes.get(i);
		}

		ArrayList<Integer> circularPrimes = new ArrayList<Integer>();

		for (i = 0; i < primesElected.length; i++) {
			if (!circularPrimes.contains(primesElected[i])) {
				int numOfDigits = (int) Math.log10(primesElected[i]) + 1;

				int tmp_circulars[] = new int[numOfDigits];
				tmp_circulars[0] = primesElected[i];

				int j = 1, next = nextCircle(primesElected[i], numOfDigits);
				boolean control = true;

				while (control && j < numOfDigits) {
					tmp_circulars[j++] = next;
					if (Arrays.binarySearch(primesElected, next) < 0)
						control = false;
					next = nextCircle(next, numOfDigits);
				}

				if (control) {
					for(j = 0; j < numOfDigits; j++) {
						circularPrimes.add(tmp_circulars[j]);
					}
				}

			}
		}

		System.out.println("Number of circular primes: " + circularPrimes.size());
		System.out.println("Program took " + (System.currentTimeMillis() - start) + "ms.");

	}

	private static int nextCircle(int number, int numberOfDigits) {

		int lastDigit = number % 10;

		number /= 10;

		number += lastDigit * Math.pow(10, numberOfDigits - 1);

		return number;
	}

}
