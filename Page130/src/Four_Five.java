import java.util.Scanner;

public class Four_Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of sides: ");
		double sides = input.nextDouble();
		
		System.out.print("Enter the side: ");
		
		double s = input.nextDouble();
		
		double area = (sides * s * s) / (4 * Math.tan(Math.PI / sides));
		
		System.out.println("The area of the polygon is " + (int)(area * 100) / 100.0);
	}

}
