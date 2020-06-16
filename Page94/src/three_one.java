import java.util.*;
public class three_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double calculate = b * b - 4 * a * c;
		double result1 = 0.0;
		double result2 = 0.0;
		
		if (calculate > 0) {
			result1 = (-b + Math.pow(calculate, 0.5)) / (2 * a);
			result2 = (-b - Math.pow(calculate, 0.5)) / (2 * a);
			System.out.println("The equation has two roots " + result1 + " and " + result2);
		}
		else if (calculate == 0) {
			result1 = (-b) / 2 * a;
			System.out.println("The equation has one roots " + result1);
		}
		else {
			System.out.println("The equation has no real roots");
		}
	}

}
