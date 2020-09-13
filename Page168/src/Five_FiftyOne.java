import java.util.Scanner;

public class Five_FiftyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter the first string: ");
	    String stringInput1 = input.nextLine();
	    
	    System.out.print("Enter the second string: ");
	    String stringInput2 = input.nextLine();
	    
	    int min = Math.min(stringInput1.length(), stringInput2.length());
	    
	    if (stringInput1.charAt(0) != stringInput2.charAt(0)) {
	    	System.out.print(stringInput1 + " and " + stringInput2 + " have no common prefix");
	    	System.exit(1);
    	}
	    
	    String record = " ";
	    
	    int i;
	    for (i = 0;i <= min - 1;i++) {
	    	if (stringInput1.charAt(i) == stringInput2.charAt(i)) {
	    		record += stringInput1.charAt(i);
	    	}
	    }
	    
	    System.out.print("The common prefix is " + record);
	}

}
