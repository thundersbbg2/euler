
public class p014 {

	static long nextCollatz(long number) {
		if (number % 2 == 0)
			return number / 2;
		else
			return number * 3 + 1;
	}

	public static void main(String[] args) {
		int longest_chain = 0;
		long longest_chain_starter = 0;
		for(int i = 2; i < 1000000; i++) {
			long next = i;
			int count = 0;

			while(next != 1) {
				next = nextCollatz(next);
				count++;
			}

			if (count > longest_chain) {
				longest_chain = count;
				longest_chain_starter = i;
			}
		}

		System.out.println(longest_chain_starter); // 837799
	}
}
