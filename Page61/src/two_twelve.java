import java.util.Scanner;

public class two_twelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();

		
		double results = speed * speed / (2 * acceleration);
		
		System.out.println("The minimum runway length for this airplane is " + results);
	}

}
