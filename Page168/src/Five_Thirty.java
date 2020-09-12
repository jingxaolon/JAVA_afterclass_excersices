import java.util.Scanner;

public class Five_Thirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the amount¡¢ " + 
				"annual interest rate " + "and months:");
		
		double amount = input.nextDouble();
		double rate = input.nextDouble();
		int month = input.nextInt();
		
		double monthlyRate = rate / 1200.0;
		double sum = 0.0;
		
		int i;
		for (i = 1;i <= month;i++) {
			sum += amount * 1.0;
			sum = sum * (1 + monthlyRate);
		}
		System.out.printf("Total amount is :%.2f", sum);
	}

}
