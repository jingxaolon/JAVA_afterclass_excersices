import java.util.Scanner;

public class Seven_ThirtyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);
	    
	    String[] zodiac = {"monkey",
	    					"rooster",
	    					"dog",
	    					"pig",
	    					"rat",
	    					"ox",
	    					"tiger",
	    					"rabbit",
	    					"dragon",
	    					"snake",
	    					"horse",
	    					"sheep"};
	    
	    System.out.print("Enter a year: ");
	    int year = input.nextInt();
	    
	    System.out.println(zodiac[year % 12]);
	}

}
