
public class p036 {
	static boolean isPalindrome(String number) {
		
		int length = number.length();
		
		for(int i = 0; i < length / 2; i++) {
			if (number.charAt(i) != number.charAt(length - i - 1)) 
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i < 1000000; i+=2) {
			if(isPalindrome(Integer.toString(i)) && isPalindrome(Integer.toBinaryString(i))) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
