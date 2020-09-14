import java.util.Scanner;

public class Six_Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("The amount invested: ");
		double amount = input.nextDouble();
		
		System.out.print("Annual interest rate: ");
		double annualRate = input.nextDouble();
		
		System.out.println("Years" + "\t\t" + "Future Value");
		int i;
		for (i = 1;i <= 30;i++) {
			System.out.print(i + "\t\t");
			System.out.printf("%.2f\n", futureInvestmentValue(amount, annualRate / 1200, i));
		}
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		double result;
		
		result = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
		
		return result;
	}
}
