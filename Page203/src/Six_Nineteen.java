import java.util.Scanner;

public class Six_Nineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if (isValid(side1, side2, side3)) {
			System.out.println("The area of the triangle is: " + area(side1, side2, side3));
		}
		else {
			System.out.print("Invalid input");
		}
	}

	public static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 < side3) {
			return false;
		}
		
		if (side2 + side3 < side1) {
			return false;
		}
		
		if (side1 + side3 < side2) {
			return false;
		}
		
		return true;
	}
	
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		
		double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
		
		return area;
	}
}
