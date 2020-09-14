import java.util.Scanner;

public class Six_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		
		int value = input.nextInt();
		
		if (isPalindrome(value)) {
			System.out.println(value + " is a palindrome ");
		}
		else {
			System.out.println(value + " is not a palindrome ");
		}
		
	}

	public static int reverse(int number) {
		int result;
		
		String temp = "";
		
		while (number % 10 != 0) {
			temp += number % 10;
			number /= 10;
		}
		
		result = Integer.parseInt(temp);
		
		return result;
	}
	
	public static boolean isPalindrome(int number) {
		return number == reverse(number)?true:false;
	}
}
