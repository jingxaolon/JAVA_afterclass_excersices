import java.util.Scanner;

public class three_twelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number like 743: ");
		 
		int num = input.nextInt();
		
		int ge = num % 10;
		int shi = num / 10 % 10;
		int bai = num /100 % 10;
		
		int result = bai + shi * 10 + ge * 100;
		if (result == num) {
			System.out.println(num + " is a palindrome");
		}
		else {
			System.out.println(num + " is not apalindrome");
		}
	}

}
