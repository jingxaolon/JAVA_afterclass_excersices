import java.util.Scanner;

public class Five_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int countForPositiveNumber = 0;
		int countForNegativeNumber = 0;
		int count = 0;
		double sum = 0.0;
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		
		int start = input.nextInt();
		while (start != 0) {
			count++;
			sum += start;
			if (start < 0) {
				countForNegativeNumber++;
			}
			else {
				countForPositiveNumber++;
			}
			
			start = input.nextInt();
		}
		
		System.out.println("The number of positives is: " + countForPositiveNumber);
		System.out.println("The number of negatives is: " + countForNegativeNumber);
		System.out.println("The total is: " + sum);
		System.out.println("The average is: " + (double)(sum / (count * 1.0)));
		
	}

}
