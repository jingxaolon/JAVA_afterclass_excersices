import java.util.Scanner;

public class Five_Fifty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter a string: ");
	    String stringInput = input.nextLine();
	    
	    //fuyin
	    int numberOfUppercase = 0;
	    
	    int i;
	    for (i = 0;i <= stringInput.length() - 1;i++) {
	    	char temp = stringInput.charAt(i);
	    	
	    	if (!Character.isLetter(temp)) {
	    		continue;
	    	}
	    	else if (Character.isUpperCase(temp)) {
	    		numberOfUppercase++;
	    	}
	    }
	    
	    System.out.println("The number of uppercase letters is " + numberOfUppercase);
	}

}
