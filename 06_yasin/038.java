import java.util.ArrayList;
import java.util.Arrays;

public class p038 {
	static boolean isPandigital(char num[]) {
		String numerals = "123456789";

		Arrays.sort(num);

		int length = num.length;

		if(String.copyValueOf(num).equals(numerals.substring(0, length)))
			return true;

		return false;
	}

	public static void main(String[] args) {
		for(int i = 9999; i >= 5000; i--) {
			ArrayList<Character> pandigitalMultiples = new ArrayList<Character>();

			char num1[] = Integer.toString(i).toCharArray();
			char num2[] = Integer.toString(i*2).toCharArray();

			for(int j = 0; j < num1.length; j++) {
				pandigitalMultiples.add(num1[j]);
			}

			for(int j = 0; j < num2.length; j++) {
				pandigitalMultiples.add(num2[j]);
			}

			char result[] = new char[9];

			for(int j = 0; j < 9; j++) {
				result[j] = pandigitalMultiples.get(j);
			}

			if(isPandigital(result.clone())) {
				System.out.println(String.copyValueOf(result)); // 932718654
				return;
			}

		}

	}
}
