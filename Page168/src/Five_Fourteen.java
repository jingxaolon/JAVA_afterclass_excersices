import java.util.Scanner;

public class Five_Fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // Create a Scanner
	    Scanner input = new Scanner(System.in);

	    // Prompt the user to enter two integers
	    System.out.print("Enter first integer: ");
	    int n1 = input.nextInt();
	    System.out.print("Enter second integer: ");
	    int n2 = input.nextInt();
	    
	    int k = Math.min(n1, n2);
	    while (n1 % k != 0 || n2 % k != 0) {
	    	k--;
	    }

	    System.out.println("The greatest common divisor for " + n1 +
	      " and " + n2 + " is " + k);
	}

}
