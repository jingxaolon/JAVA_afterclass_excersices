import java.util.*;

public class Nine_Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		double a, b, c;
		System.out.println("Enter the value of a, b, c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		QuadraticEquation new1 = new QuadraticEquation(a, b, c);
		double quadraticEquation1 = new1.getDiscriminant();
		System.out.println("The QuadraticEquation is: " + quadraticEquation1);
		
		if (quadraticEquation1 > 0) {
			System.out.println("root1 is: " + new1.getRoot1());
			System.out.println("root2 is: " + new1.getRoot2());
		}
		else if (Math.abs(quadraticEquation1 - 0.0) < 10E-14) {
			System.out.println("root is: " + new1.getRoot1());
		}
		else {
			System.out.println("The equation has no roots.");
		}
	}

}

class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation() {
		
	}
	
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getDiscriminant() {
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	public double getRoot1() {
		double tmp = getDiscriminant();
		if (tmp < 0) {
			return 0;
		}
		
		return (-b + Math.pow(tmp, 0.5)) / (2 * a);
	}
	
	public double getRoot2() {
		double tmp = getDiscriminant();
		if (tmp < 0) {
			return 0;
		}
		
		return (-b - Math.pow(tmp, 0.5)) / (2 * a);
	}
}