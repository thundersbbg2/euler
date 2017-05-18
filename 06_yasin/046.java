
public class p046 {

	static final int N = 100000, n = 10000;

	static void generatePrimes(int primes[], int numbers[]) {
		for (int i = 0; i < N; i++) {
			numbers[i] = i + 1;
		}

		int k = 0;

		for (int i = 2; i < N && k < n; i++) {
			if (numbers[i] != 0) {
				primes[k++] = i;
				int j = i + i;

				while (j < N) {
					numbers[j] = 0;
					j += i;
				}
			}

		}

	}

	static boolean isGoldbachComposite(int number, int primes[]) {
		int i = 0;
		double square;

		boolean control = false;

		while (primes[i] < number && !control) {
			square = Math.sqrt((number - primes[i]) / 2);
			if (square == Math.floor(square)) {
				control = true;
			}
			i++;
		}

		return control;
	}

	public static void main(String[] args) {

		int numbers[] = new int[N];
		int primes[] = new int[n];

		generatePrimes(primes, numbers);

		int composites[] = new int[N];
		for (int i = 0; i < N; i++)
			composites[i] = -1;

		int i = 0;

		for (int j = 0; j < N; j++) {
			if (numbers[j] == 0 && j % 2 == 1)
				composites[i++] = j;
		}

		i = 0;

		while (isGoldbachComposite(composites[i], primes) && composites[i] != -1) {
			i++;
		}

		System.out.println(composites[i]);

	}
}
