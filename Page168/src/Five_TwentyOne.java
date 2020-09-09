import java.util.Scanner;

public class Five_TwentyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		//final double EPSILON = 10E-14;
		
		System.out.print("Loan Amount: ");
		double amount = input.nextDouble();
		
		System.out.print("Number of Years: ");
		int  year = input.nextInt();
		
		System.out.printf("Interest Rate" + "\t\t" + "Mouthly Payment" + "\t\t" + "Total Payment\n");
		
		double rateStart = 0.05;
		double raise = 0.00125;
		//Math.abs(rateStart - 0.08) > EPSILON
		while (rateStart < 0.081) {
			System.out.printf("%.3f%%" + "\t\t\t" + "%-14.2f" + "\t\t" + "%-13.2f\n", 
					rateStart * 100.0, (amount * rateStart / 12) / (1 - 1 / Math.pow(1 + rateStart / 12, year * 12)), 
					(amount * rateStart / 12) / (1 - 1 / Math.pow(1 + rateStart / 12, year * 12)) * 12 * year);
			rateStart += raise;
		}
	}

}
