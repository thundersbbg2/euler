
public class p004 {
	static boolean isPalindrome(String number) {

		int length = number.length();

		for(int i = 0; i < length / 2; i++) {
			if (number.charAt(i) != number.charAt(length - i - 1))
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		int i = 999, j = 999;

		int max = 0, product;

		while(i >= 100) {
			j = i;
			while (j >= 100) {
				product = i*j;
				if (isPalindrome(Integer.toString(product))) {
					if (product > max)
						max = product;
				}
				j--;
			}
			i--;
		}

		System.out.println(max);
	}
}
