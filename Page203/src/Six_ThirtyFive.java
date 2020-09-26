import java.util.Scanner;

public class Six_ThirtyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side: ");
		
		double side = input.nextDouble();
		System.out.print("The area of the pentagon is " + area(side));
	}

	public static double area(double side) {
		return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
	}
}
