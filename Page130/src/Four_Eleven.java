import java.util.Scanner;

public class Four_Eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		
		int x = input.nextInt();
		
		if (x > 15 || x < 0) {
			System.out.println(x + " is an invalid input");
		}
		else {
			if (x < 10) {
				System.out.println("The hex value is: " + x);
			}
			else {
				switch(x) {
				case 10:System.out.println("The hex value is: " + 'A');break;
				case 11:System.out.println("The hex value is: " + 'B');break;
				case 12:System.out.println("The hex value is: " + 'C');break;
				case 13:System.out.println("The hex value is: " + 'D');break;
				case 14:System.out.println("The hex value is: " + 'E');break;
				case 15:System.out.println("The hex value is: " + 'F');break;
				}
			}
		}
	}

}
