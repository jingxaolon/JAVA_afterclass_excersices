import java.util.Scanner;

public class Four_Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ASCII code: ");
		
		byte code = input.nextByte();
		
		System.out.println("The character for ASCII code " + code + " is " + (char)code);
	}

}
