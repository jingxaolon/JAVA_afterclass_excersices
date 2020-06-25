import java.util.Scanner;

public class three_thirty_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double unchange = 1e-14;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight and price for package 1: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		double result1 = y0 * 1.0 / x0;
		double result2 = y1 * 1.0 / x1;
		
		if (result1 < result2) {
			System.out.println("Package 1 has a better price");
		}
		else if (Math.abs(result1 - result2) < unchange) {
			System.out.println("Two packages have the same price");
		}
		else {
			System.out.println("Package 2 has a better price");
		}
	}

}
