import java.util.Scanner;

public class Five_ThirtyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // Generate a lottery
	    //int lottery = (int)(Math.random() * 100);
		int firstLotteryNumber = 0;
		while (firstLotteryNumber == 0) {
			firstLotteryNumber = (int)(Math.random() * 10);
		}
		
		int secondLotteryNumber = 0;
		
		do {
			secondLotteryNumber = (int)(Math.random() * 10);
		}while(firstLotteryNumber == secondLotteryNumber);

	    // Prompt the user to enter a guess
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter your lottery pick (two digits): ");
	    int guess = input.nextInt();

	    // Get digits from lottery
	    int lotteryDigit1 = firstLotteryNumber;
	    int lotteryDigit2 = secondLotteryNumber;
	    int lottery = firstLotteryNumber * 10 + secondLotteryNumber;

	    // Get digits from guess
	    int guessDigit1 = guess / 10;
	    int guessDigit2 = guess % 10;

	    System.out.println("The lottery number is " + lottery);

	    // Check the guess
	    if (guess == lottery)
	      System.out.println("Exact match: you win $10,000");
	    else if (guessDigit2 == lotteryDigit1
	          && guessDigit1 == lotteryDigit2)
	      System.out.println("Match all digits: you win $3,000");
	    else if (guessDigit1 == lotteryDigit1 
	          || guessDigit1 == lotteryDigit2 
	          || guessDigit2 == lotteryDigit1 
	          || guessDigit2 == lotteryDigit2)
	      System.out.println("Match one digit: you win $1,000");
	    else
	      System.out.println("Sorry, no match"); 
	}

}
