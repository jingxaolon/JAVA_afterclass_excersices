import java.util.Scanner;

public class Six_Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		
		double value1 = input.nextDouble();
		double value2 = input.nextDouble();
		double value3 = input.nextDouble();
		
		displaySortedNumbers(value1, value2, value3);
	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double max, mid, min;
		
		if (num1 > num2) {
			if (num2 > num3) {
				max = num1;
				mid = num2;
				min = num3;
			}
			else {
				if (num1 > num3) {
					max = num1;
					mid = num3;
					min = num2;
				}
				else {
					max = num3;
					mid = num1;
					min = num2;
				}
			}
		}
		else {
			if (num1 > num3) {
				max = num2;
				mid = num1;
				min = num3;
			}
			else {
				if (num2 > num3) {
					max = num2;
					mid = num3;
					min = num1;
				}
				else {
					max = num3;
					mid = num2;
					min = num1;
				}
			}
		}
		
		System.out.printf("%.2f\t%.2f\t%.2f\n", min, mid, max);
	}
}
