import java.util.Arrays;

public class p044 {
	static void generatePentagonalNumbers(int pentagonalNumbers[]) {
		for(int i = 0; i < pentagonalNumbers.length; i++) {
			pentagonalNumbers[i] = (i+1) * (3*(i+1) -1) / 2;
		}
	}

	static int findMinDifference(int pentagonalNumbers[]) {

		for (int i = 0; i < pentagonalNumbers.length; i++) {
			for(int j = i+1; j < pentagonalNumbers.length; j++) {
				int sum = pentagonalNumbers[i] + pentagonalNumbers[j];
				int difference = pentagonalNumbers[j] - pentagonalNumbers[i];

				if(Arrays.binarySearch(pentagonalNumbers, sum) >= 0 && Arrays.binarySearch(pentagonalNumbers, difference) >= 0) {
					return difference;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int pentagonals[] = new int[10000];

		generatePentagonalNumbers(pentagonals);

		int minDifference = findMinDifference(pentagonals);

		System.out.println(minDifference);

	}
}
