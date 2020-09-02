import java.util.Scanner;

public class Four_Twelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex digit: ");
		
		String s = input.nextLine();
		char x = s.charAt(0);
		
		if ((x >= 49 && x <= 57 ) || (x >= 65 && x <= 69 )) {
			switch(x) {
			case 49:System.out.println("The binary value is " + "0001");break;
			case 50:System.out.println("The binary value is " + "0010");break;
			case 51:System.out.println("The binary value is " + "0011");break;
			case 52:System.out.println("The binary value is " + "0100");break;
			case 53:System.out.println("The binary value is " + "0101");break;
			case 54:System.out.println("The binary value is " + "0110");break;
			case 55:System.out.println("The binary value is " + "0111");break;
			case 56:System.out.println("The binary value is " + "1000");break;
			case 57:System.out.println("The binary value is " + "1001");break;
			case 65:System.out.println("The binary value is " + "1010");break;
			case 66:System.out.println("The binary value is " + "1011");break;
			case 67:System.out.println("The binary value is " + "1100");break;
			case 68:System.out.println("The binary value is " + "1101");break;
			case 69:System.out.println("The binary value is " + "1110");break;
			}
		}
		else {
			System.out.println(x + " is an invalid input");
		}
	}

}
