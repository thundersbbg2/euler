import java.util.ArrayList;
import java.util.Arrays;

public class p032 {
	static boolean isPandigitalWithLength9(char num[]) {
		if (num.length != 9)
			return false;

		String numerals = "123456789";

		Arrays.sort(num);

		if (String.copyValueOf(num).equals(numerals))
			return true;

		return false;
	}

	public static void main(String[] args) {
		int sum_of_pandigital_products = 0;

		ArrayList<Integer> pandigitalProducts = new ArrayList<Integer>();

		for (int i = 1; i < 10000; i++) {
			for (int j = i + 1; j < 10000; j++) {
				int product = i * j;
				String num1 = Integer.toString(i);
				String num2 = Integer.toString(j);
				String num3 = Integer.toString(product);
				if (isPandigitalWithLength9((num1 + num2 + num3).toCharArray())) {
					pandigitalProducts.add(product);
				}
			}
		}

		ArrayList<Integer> pandigitalProductsOnlyOne = new ArrayList<Integer>();

		int size = pandigitalProducts.size();

		for (int i = 0; i < size; i++) {
			if (!pandigitalProductsOnlyOne.contains(pandigitalProducts.get(i))) {
				pandigitalProductsOnlyOne.add(pandigitalProducts.get(i));
				sum_of_pandigital_products += pandigitalProducts.get(i);
			}
		}

		System.out.println(sum_of_pandigital_products); // 45228
	}
}
