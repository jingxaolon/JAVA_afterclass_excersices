import java.util.Scanner;

public class two_twenty_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double mg = input.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double pg = input.nextDouble();
		
		double results = distance / mg * pg;
		
		System.out.println("The cost of driving is " + results);
	}

}
