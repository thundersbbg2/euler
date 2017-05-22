
public class p017 {
	public static void main(String[] args) {

		String numbers_ones = "onetwothreefourfivesixseveneightnine";
		String numbers_tens = "twentythirtyfortyfiftysixtyseventyeightyninety";
		String numbers_in_tens = "teneleventwelvethirteenfourteenfifteensixteenseventeeneighteennineteen";
		String numbers_hundreds = "hundred"; 
		
		int numbersWithOnes = (9 + 9*9 + 100) * numbers_ones.length();
		int numbersWithAnd = 3 * (900-9); // 3 is the length of "and".
		int numbersWithTens = (10 + 90) * numbers_tens.length();
		int numbersWithInTens = (1 + 9) * numbers_in_tens.length();
		int numbersWithHundreds = 900 * numbers_hundreds.length();
		
		int total = numbersWithOnes + numbersWithAnd + numbersWithTens + numbersWithInTens + numbersWithHundreds + "onethousand".length();
		
		System.out.println(total);	
		
	}
}
