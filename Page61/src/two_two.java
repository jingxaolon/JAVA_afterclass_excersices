import java.util.Scanner;

public class two_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		double area = radius * radius * PI;
		double volume = area * length;
		
		//System.out.println("The area is " + (int)(area * 100) / 100.0);
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}

}
