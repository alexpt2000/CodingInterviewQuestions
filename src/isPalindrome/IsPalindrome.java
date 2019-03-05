package isPalindrome;

public class IsPalindrome {

	public static void main(String[] args) {
		
		String test1 = "aba"; //true
		String test2 = "abc"; //false
		String test3 = "ccbcc"; //true
		
		System.out.println(isPalindrome(test1));
		System.out.println(isPalindrome(test2));
		System.out.println(isPalindrome(test3));
	}

	public static boolean isPalindrome(String input) {
		boolean result = true;
		input = input.toLowerCase();
		int left = 0;
		int right = input.length() - 1;
		
		while (left < right) {
			if (input.charAt(left++) != input.charAt(right--)) {
				result = false;
				break;
			}
		}
		return result;
	}
}
