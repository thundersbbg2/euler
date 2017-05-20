public class p043 {

	static int find_k(char numbers[]) {
		int max_k = -1;
		for (int k = 0; k < numbers.length - 1; k++) {
			if (numbers[k + 1] > numbers[k])
				max_k = k;
		}

		return max_k;
	}

	static int find_l(char numbers[], int k) {
		int max_l = k + 1;

		for (int l = k + 2; l < numbers.length; l++) {
			if (numbers[l] > numbers[k])
				max_l = l;
		}

		return max_l;
	}

	static void swap(char numbers[], int k, int l) {
		char tmp = numbers[k];
		numbers[k] = numbers[l];
		numbers[l] = tmp;
	}

	static void reverse(char numbers[], int kPlusOne) {
		for (int i = kPlusOne, j = numbers.length - 1; i < (numbers.length + kPlusOne) / 2; i++, j--) {
			char tmp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = tmp;
		}
	}

	static void print(char numbers[]) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		/*
		 * Find the largest index l greater than k such that a[k] < a[l]. Swap
		 * the value of a[k] with that of a[l]. Reverse the sequence from a[k +
		 * 1] up to and including the final element a[n] Find the largest index
		 * k such that a[k] < a[k + 1]. If no such index exists, the permutation
		 * is the last permutation.
		 */

		long sum = 0;

		char numbers[] = { '1', '0', '2', '3', '4', '5', '6', '7', '8', '9' };

		int k = numbers.length - 2, l;

		do {
			sum += substring_divisibility(String.copyValueOf(numbers));
			l = find_l(numbers, k);
			swap(numbers, k, l);
			reverse(numbers, k + 1);
			k = find_k(numbers);
		} while (k != -1);

		System.out.println(sum);

		System.out.println(System.currentTimeMillis() - start + "ms.");

	}

	private static long substring_divisibility(String numbers) {
		boolean control = true;

		int nums[] = {2, 3, 5, 7, 11, 13, 17};

		int i = 0, j = 6;

		long number = Long.parseLong(numbers);

		while (control && i < 7) {
			control = ((number / (int)Math.pow(10, j)) % 1000) % nums[i] == 0;
			i++;
			j--;
		}

		if (control)
			return number;

		return 0;
	}

}
