import java.util.Scanner;

public class Five_FortyEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter a string: ");
	    String stringInput = input.nextLine();
	    
	    int i;
	    for (i = 0;i <= stringInput.length() - 1;i += 2) {
	    	System.out.print(stringInput.charAt(i));
	    }
	}

}
