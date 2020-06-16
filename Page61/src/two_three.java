import java.util.Scanner;

public class two_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1Ó¢³ßµÈÓÚ0.305Ã×
		final double TRANS = 0.305;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();

		double meters = feet * TRANS;
		System.out.println(feet + " feet is  " + meters + " meters");
	}

}
