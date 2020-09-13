import java.util.Scanner;

public class Five_FortySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
	    String stringInput = input.next();
	    
	    if (stringInput.length() != 12) {
	    	System.out.print(stringInput + " is an invalid input");
	    	System.exit(1);
	    }
	    
	    int temp = 0;
	    int sum = 0;
	    
	    int i;
	    for (i = 0;i <= stringInput.length() - 1;i++) {
	    	temp = (int)(stringInput.charAt(i) - '0');
	    	if (i % 2 == 0) {
	    		sum += temp;
	    	}
	    	else {
	    		sum += temp * 3;
	    	}
	    	
	    }
	    
	    int lastNumber = 10 - sum % 10;
	    
	    if (lastNumber == 10)
	    	lastNumber = 0;
	    
	    System.out.println("The ISBN-13 number is " + stringInput + lastNumber);
	}

}
