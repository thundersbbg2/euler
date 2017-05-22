
public class p034 {
	static int factorial(int number) {
		int result = 1;

		for (int i = 2; i <= number; i++) {
			result *= i;
		}

		return result;
	}

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 10; i < 1000000; i++) {
			int sum_of_digits_factorial = 0;
			int tmp_num = i;

			while (tmp_num != 0) {
				sum_of_digits_factorial += factorial(tmp_num % 10);
				tmp_num /= 10;
			}

			if (i == sum_of_digits_factorial) {
				sum += i;
			}

		}

		System.out.println(sum); // 40730

	}

}
