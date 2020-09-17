import java.util.Scanner;

public class Six_TwentyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		int value = input.nextInt();
		
		System.out.print("The sqrt of this number is: " + sqrt(value));
	}

	public static double sqrt(long n) {
		final double CONSTANT = 0.0001;
		double lastGuess = 1.0;
		double nextGuess = 0.0;
		
		nextGuess = (lastGuess + n / lastGuess) / 2;
		
		while (Math.abs(nextGuess - lastGuess) > CONSTANT) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		
		return nextGuess;
	}
}
