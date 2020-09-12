import java.util.Scanner;

public class Five_ThirtyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the initial deposit amount: ");
		double amount = input.nextDouble();
		
		System.out.printf("Enter annual percentage yield: ");
		double rate = input.nextDouble();
		double monthlyRate = rate / 1200.0;
		
		System.out.printf("Enter maturity period (number of months): ");
		int month = input.nextInt();
		
		double sum = 0.0;
		sum = amount;
		
		System.out.printf("\nMonth\t\tCD Value\n");
		int i;
		for (i = 1;i <= month;i++) {
			sum = sum * (1 + monthlyRate);
			System.out.printf("%d\t\t%.2f\n", i, sum);
		}

	}

}
