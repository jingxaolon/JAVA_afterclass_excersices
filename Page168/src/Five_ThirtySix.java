import java.util.Scanner;

public class Five_ThirtySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
	    String number = input.next();
	    
	    //System.out.println(number);
	    int temp = 0;
	    int sum = 0;
	    
	    int i;
	    for (i = 0;i <= 8;i++) {
	    	temp = (int)(number.charAt(i) - '0');
	    	sum += temp * (i + 1);
	    }
	    char lastCharacter = (char)(sum % 11);
	    
	    if (sum % 11 == 10)
	    	lastCharacter = 'X';
	    
	    System.out.println("The ISBN-10 number is " + number + lastCharacter);
	}

}
