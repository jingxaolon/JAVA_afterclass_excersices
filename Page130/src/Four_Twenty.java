import java.util.Scanner;

public class Four_Twenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		int length = s.length();
		char character = s.charAt(0);
		
		System.out.println("The length of the string inputted is " + length + " and the first character is " + character);
	}

}
