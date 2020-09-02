import java.util.Scanner;

public class Four_TwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner input = new Scanner(System.in);

	    // Receive the amount 
	    System.out.print(
	      "Enter an amount in double, for example 11.56: ");
	    String s1 = input.nextLine();
	    int dot = s1.lastIndexOf('.');
	    
	    String begin = s1.substring(0, dot);
	    String end = s1.substring(dot + 1);
	    
	    //计算小数点后有几位
	    int count = end.length();
	    
	    int p1 = Integer.parseInt(begin);
	    int p2 = Integer.parseInt(end);
	    double amount = p1 + p2 / Math.pow(10, count);
	    //double amount = input.nextDouble();

	    int remainingAmount = (int)(amount * 100);

	    // Find the number of one dollars
	    int numberOfOneDollars = remainingAmount / 100;
	    remainingAmount = remainingAmount % 100;

	    // Find the number of quarters in the remaining amount
	    int numberOfQuarters = remainingAmount / 25;
	    remainingAmount = remainingAmount % 25;

	    // Find the number of dimes in the remaining amount
	    int numberOfDimes = remainingAmount / 10;
	    remainingAmount = remainingAmount % 10;

	    // Find the number of nickels in the remaining amount
	    int numberOfNickels = remainingAmount / 5;
	    remainingAmount = remainingAmount % 5;

	    // Find the number of pennies in the remaining amount
	    int numberOfPennies = remainingAmount;

	    // Display results
	    System.out.println("Your amount " + amount + " consists of"); 
	    System.out.println("    " + numberOfOneDollars + " dollars");
	    System.out.println("    " + numberOfQuarters + " quarters ");
	    System.out.println("    " + numberOfDimes + " dimes"); 
	    System.out.println("    " + numberOfNickels + " nickels");
	    System.out.println("    " + numberOfPennies + " pennies");
	}

}
