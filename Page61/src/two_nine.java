import java.util.Scanner;

public class two_nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v0, v1, and t: ");
		
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double results = (v1 - v0) / t;
		
		System.out.println("The average acceleration is " + results);
	}

}
