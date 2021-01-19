import java.util.Scanner;

public class Nine_Eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		double a, b, c, d, e, f;
		System.out.println("Enter the value of a, b, c, d, e, f: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		
		LinearEquation new1 = new LinearEquation(a, b, c, d, e, f);
		
		if (new1.isSolvable()) {
			System.out.println("x is " + new1.getX() + " and " + "y is " + new1.getY());
		}
		else {
			System.out.println("The equation has no solution.");
			System.exit(1);
		}
	}

}

class LinearEquation {
	private double a, b, c, d, e, f;
	
	public LinearEquation() {
		
	}
	
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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
	
	public double getD() {
		return d;
	}
	
	public double getE() {
		return e;
	}
	
	public double getF() {
		return f;
	}
	
	public boolean isSolvable() {
		if (Math.abs((a * d - b * c) - 0.0) < 10E-14) {
			return false;
		}
		
		return true;
	}
	
	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}
	
	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
}