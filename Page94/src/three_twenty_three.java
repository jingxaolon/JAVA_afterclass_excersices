import java.util.Scanner;

public class three_twenty_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double EPSILON = 1e-14;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		
		if (Math.abs(x) < (10.0 / 2) && Math.abs(y) < (5.0 / 2)) {
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
		}
		else {
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
		}
	}

}
