import java.util.ArrayList;

public class p040 {
	public static void main(String[] args) {
		int i = 1, number = 0;

		while (number <= 1000000) {
			number += i * 9 * Math.pow(10, i - 1);
			i++;
		}

		int upper = (int) Math.pow(10, i - 1);

		ArrayList<Character> fraction = new ArrayList<Character>();

		for(i = 1; i < upper; i++) {
			char num[] = Integer.toString(i).toCharArray();

			for(int j = 0; j < num.length; j++) {
				fraction.add(num[j]);
			}
		}

		int result = Character.digit(fraction.get(0), 10) * Character.digit(fraction.get(9), 10)
				* Character.digit(fraction.get(99), 10) * Character.digit(fraction.get(999), 10)
				* Character.digit(fraction.get(9999), 10) * Character.digit(fraction.get(99999), 10)
				* Character.digit(fraction.get(999999), 10);

		System.out.println(result); // 210

	}
}
