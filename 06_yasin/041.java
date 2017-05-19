import java.util.Arrays;

public class p041 {

	static boolean isPandigital(int number) {
		String numerals = "123456789";

		char num[] = Integer.toString(number).toCharArray();

		Arrays.sort(num);

		int length = num.length;

		if(String.copyValueOf(num).equals(numerals.substring(0, length)))
			return true;

		return false;
	}

	static boolean isPrime(int number) {
		for(int i = 3; i*i <= number; i++) {
			if (number % i == 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		int number = 999999999;
		boolean control = true;

		do {
			number -= 2;
			if (isPandigital(number)) {
				if (isPrime(number))
					control = false;
			}
		} while(control);

		System.out.println(number); // 7652413
	}

}
