import java.util.Scanner;

public class two_fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double TRANS_TO_KG = 0.45359237;
		final double TRANS_TO_M = 0.0254;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		
		double kg = pounds * TRANS_TO_KG;
		double meter = height * TRANS_TO_M;
		
		double results = kg / Math.pow(meter, 2);
		
		System.out.println("BMI is " + results);
	}

}
