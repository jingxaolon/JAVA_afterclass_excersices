import java.util.Scanner;

public class three_nineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the three sides of the triangle: ");
	    
	    double x1 = input.nextDouble();
	    double x2 = input.nextDouble();
	    double x3 = input.nextDouble();
	    
	    double perimeter = 0.0;
	    
	    if ((x1 + x2 > x3) && (x1 + x3 > x2) && (x3 + x2 > x1)) {
	    	perimeter = x1 + x2 + x3;
	    }
	    else {
	    	System.out.println("Invalid input ");
	    	System.exit(1);
	    }
	    System.out.println("The perimeter is " + perimeter);
	}

}
