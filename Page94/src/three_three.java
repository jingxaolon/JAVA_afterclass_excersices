import java.util.*;
public class three_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double fenmu = a * d - b * c;
		
		double fenzi1 = e * d - b * f;
		double fenzi2 = a * f - e * c;
		
		if (Math.abs(fenmu - 0.0) < 10E-14) {
			System.out.println("The equation has no solution");
			System.exit(1);
		}
		else {
			System.out.println("x is " + (fenzi1 / fenmu) + " and " + "y is " + (fenzi2 / fenmu));
		}
	}

}
