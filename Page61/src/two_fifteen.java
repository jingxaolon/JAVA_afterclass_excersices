import java.util.Scanner;

public class two_fifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double r1 = Math.pow((x2 - x1), 2);
		double r2 = Math.pow((y2 - y1), 2);
		double results = Math.pow((r1 + r2), 0.5);
		
		System.out.println("The distance between the two points is " + results);
	}

}
