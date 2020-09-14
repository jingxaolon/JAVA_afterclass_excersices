import java.util.Scanner;

public class Six_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		
		int value = input.nextInt();
		
		System.out.println(sumDigits(value));
	}
	
	public static int sumDigits(long n) {
		int result = 0;
		
		while (n % 10 != 0) {
			result += n % 10;
			n /= 10;
		}
		
		return result;
	}

}
