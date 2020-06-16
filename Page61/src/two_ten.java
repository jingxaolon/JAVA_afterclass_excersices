import java.util.Scanner;

public class two_ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double kg = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double temp = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double ftemp = input.nextDouble();
		
		double results = kg * (ftemp - temp) * 4184;
		
		System.out.println("The energy needed is " + results);
	}

}
