import java.util.Scanner;

public class two_sixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double CONSTANT = (3 * Math.pow(3, 0.5)) / 2.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the side: ");
		double length = input.nextDouble();
		
		double results = CONSTANT * Math.pow(length, 2);
		
		System.out.println("The area of the hexagon is " + results);
	}

}
