import java.util.Scanner;

public class three_eighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double EPSILON = 1e-14;
		
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the weight of your package: ");
	    
	    double weight = input.nextDouble();
	    double cost = 0.0;
	    
	    if ((weight - 0) < EPSILON) {
	    	System.out.println("Invalid input ");
	    	System.exit(1);
	    }
	    
	    if ((weight > 20) && Math.abs(weight - 20) > EPSILON) {
	    	System.out.println("The package cannot be shipped ");
	    	System.exit(1);
	    }

	    if (weight <= 1) {
	    	cost = 3.5;
	    }
	    else if (weight <= 3) {
	    	cost = 5.5;
	    }
	    else if (weight <= 10) {
	    	cost = 8.5;
	    }
	    else
	    	cost = 10.5;
	    
	    System.out.println("The cost for your ship is " + cost);
	}

}
