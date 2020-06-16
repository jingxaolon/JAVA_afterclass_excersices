import java.util.Scanner;

public class two_five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();
		
		double gratuity = rate / 100.0 * subtotal;
		
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}

}
