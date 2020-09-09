import java.util.Scanner;

public class Five_TwentyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		//final double EPSILON = 10E-14;
		
		System.out.print("Loan Amount: ");
		double amount = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int  year = input.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		double  rate = input.nextDouble();
		
		double monthlyPayment = (amount * rate / 1200) / (1 - 1 / Math.pow(1 + rate / 1200, year * 12));
		
		System.out.println();
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
		
		System.out.printf("Total Payment: %.2f\n", monthlyPayment * year * 12);
		
		
		System.out.println();
		System.out.printf("Payment#" + "\t\t" + "Interest" + "\t\t" + "Principal" + "\t\t" + "Balance\n");
		
		int i;
		double interest = 0.0, principal = 0.0, balance = amount;
		for (i = 1;i <= year * 12;i++) {
			interest = rate / 1200 * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			
			System.out.printf("%d" + "\t\t\t" + "%.2f"
					+ "\t\t\t" + "%.2f" + "\t\t\t" + "%.2f\n", i, interest, principal, balance);
			//System.out.println(i + "\t\t" + interest
			//		+ "\t\t" + principal + "\t\t" + balance);
		}
	}

}
