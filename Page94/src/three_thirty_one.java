import java.util.Scanner;

public class three_thirty_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int convert_type = input.nextInt();
		
		//System.out.print("Enter the dollar amount: ");
		//double amount = input.nextDouble();
		
		double amount = 0.0;
		double results = 0.0;
		
		switch(convert_type) {
		case 0:
			System.out.print("Enter the dollar amount: ");
			amount = input.nextDouble();
			results = amount * rate;
			System.out.println("$" + amount + " is " + results + " yuan");
		break;
		case 1:
			System.out.print("Enter the RMB amount: ");
			amount = input.nextDouble();
			results = amount * 1.0 / rate;
			System.out.println(amount + " yuan is $" + results);
		break;
		default:
			System.out.println("Incorrect input");
		}
	}

}
