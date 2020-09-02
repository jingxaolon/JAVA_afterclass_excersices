import java.util.Scanner;

public class Four_Twentythree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String s1 = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hour = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double payrate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double taxrate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double staterate = input.nextDouble();
		
		System.out.println("Employee Name: " + s1);
		System.out.printf("Hours Worked: %.1f\n", hour);
		System.out.printf("Pay Rate: $%.2f\n", payrate);
		System.out.printf("Gross Pay: $%.1f\n", payrate * hour);
		System.out.println("Deductions: ");
		System.out.printf("  Federal Withholding (20.0%%): $%.1f\n", payrate * hour * taxrate);
		System.out.printf("  State Withholding (9.0%%): $%.2f\n", payrate * hour * staterate);
		System.out.printf("  Total Deductions: $%.2f\n", (payrate * hour * 0.2 + payrate * hour * 0.09));
		System.out.printf("  Net Pay: $%.2f\n", (payrate * hour - (payrate * hour * 0.2 + payrate * hour * 0.09)));
	}

}
