import java.util.Scanner;

public class three_twenty_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double EPSILON = 1e-14;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double result = Math.pow((x * x + y * y), 0.5);
		
		if (result < 10) {
			System.out.println("Point (" + x + ", " + y + ") is in the circle");
		}
		else {
			System.out.println("Point (" + x + ", " + y + ") is not in the circle");
		}
	}

}
