import java.util.Scanner;

public class Four_Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		
		String s = input.nextLine();
		char character = s.charAt(0);
		
		System.out.println("The Unicode for the character " + character + " is " + (int)character);
	}

}
