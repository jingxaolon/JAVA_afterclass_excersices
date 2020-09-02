import java.util.Scanner;

public class Four_Nineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
	    String s = input.nextLine();
	    
	    int number = Integer.parseInt(s);
	    
	    int remainNumber = number;
	    
	    int n9 = remainNumber % 10;
	    remainNumber = remainNumber / 10;
		    
	    int n8 = remainNumber % 10;
	    remainNumber = remainNumber / 10;

	    int n7 = remainNumber % 10;
	    remainNumber = remainNumber / 10;

	    int n6 = remainNumber % 10;
	    remainNumber = remainNumber / 10;

	    int n5 = remainNumber % 10;
	    remainNumber = remainNumber / 10;

	    int n4 = remainNumber % 10;
	    remainNumber = remainNumber / 10;
	    
	    int n3 = remainNumber % 10;
	    remainNumber = remainNumber / 10;
 
	    int n2 = remainNumber % 10;
	    remainNumber = remainNumber / 10;

	    int n1 = remainNumber % 10;
	    remainNumber = remainNumber / 10;

	    System.out.print("The ISBN-10 number is ");
	    System.out.print(n1);
	    System.out.print(n2);
	    System.out.print(n3);
	    System.out.print(n4);
	    System.out.print(n5);
	    System.out.print(n6);
	    System.out.print(n7);
	    System.out.print(n8);
	    System.out.print(n9);
	    
	    int result = (n1 * 1 + n2 * 2 + n3 * 3 + n4 * 4 + 
	    		n5 * 5 + n6 * 6 + n7 * 7 + n8 * 8 + n9 * 9) % 11;
	    
	    if (result == 10)
	    	System.out.print("X");
	    else
	    	System.out.println(result);
	}

}
