import java.util.ArrayList;

public class p026 {
	static int recurring_cycle(int number) {
		int divided = 1, remainder;
		String result = "";

		ArrayList<Integer> remainders = new ArrayList<Integer>();
		remainders.add(1);

		boolean control = true;

		do {
			divided *= 10;

			while (divided < number) {
				divided *= 10;
				result += "0";
			}

			remainder = divided % number;
			result += Integer.toString(divided / number);
			divided = remainder;

			if (remainders.contains(remainder)) {
				control = false;
			} else {
				remainders.add(remainder);
				control = remainder != 0;
			}

		} while (control);

		if (remainder == 0)
			return 0;
		else
			return result.length() - remainders.indexOf(remainder);
	}

	public static void main(String[] args) {
		int longest_cycle = 0;
		int longest_cycle_index = 0;
		int cycle;

		for (int i = 1; i < 1000; i++) {
			cycle = recurring_cycle(i);

			if (cycle > longest_cycle) {
				longest_cycle = cycle;
				longest_cycle_index = i;
			}
		}

		System.out.println(longest_cycle_index);
	}
}
