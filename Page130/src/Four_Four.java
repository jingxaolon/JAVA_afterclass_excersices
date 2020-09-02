import java.util.Scanner;

public class Four_Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		
		double s = input.nextDouble();
		
		double area = (6 * s * s) / (4 * Math.tan(Math.PI / 6));
		
		System.out.println("The area of the hexagon is " + (int)(area * 100) / 100.0);
	}

}
