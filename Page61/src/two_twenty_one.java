import java.util.Scanner;

public class two_twenty_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double amount = input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");	
		double rate = input.nextDouble();
		
		System.out.print("Enter number of years: ");	
		int years = input.nextInt();
		
		double results = amount * Math.pow((1 + rate / 1200), years * 12);
		
		System.out.println("Future value is " + results);
	}

}
