import java.util.Scanner;

public class Five_FortyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the commission sought: ");
		double commissionSought = input.nextDouble();
		
		double sales = 10000;
		
		double commissionSalary;
		for (commissionSalary = 900.0;commissionSalary <= commissionSought;sales++) {
			if (sales <= 5000) {
				//0.01-5000  8%
				commissionSalary = sales * 0.08;
			}
			else if (sales <= 10000) {
				//5000.01-10000  10%
				commissionSalary = 5000 * 0.08 + (sales - 5000) * 0.1;
			}
			else {
				//10000.01-  12%
				commissionSalary = 5000 * 0.08 + 5000 * 0.1 + (sales - 10000) * 0.12;
			}
		}
		
		System.out.print("Minimum sales that must be completed: " + sales);
	}

}
