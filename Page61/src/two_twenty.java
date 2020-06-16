import java.util.Scanner;

public class two_twenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		
		double balance = input.nextDouble();
		double rate = input.nextDouble();
		
		double results = balance * (rate / 1200.0);
		
		System.out.println("The interest is " + results);
	}

}
