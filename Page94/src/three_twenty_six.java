import java.util.Scanner;

public class three_twenty_six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int x1 = input.nextInt();
		
		System.out.print("Is " + x1 + " divisible by " + 5 + " and " + 6 + "? " );
		if (x1 % 5 == 0 && x1 % 6 == 0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		System.out.print("Is " + x1 + " divisible by " + 5 + " or " + 6 + "? " );
		if (x1 % 5 == 0 || x1 % 6 == 0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		System.out.print("Is " + x1 + " divisible by " + 5 + " or " + 6 + ", but not both? " );
		if (x1 % 5 == 0 ^ x1 % 6 == 0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
