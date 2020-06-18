import java.util.Scanner;

public class three_fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number(0 or 1): ");
		
		int num = input.nextInt();
		
		int randNum = (int)(Math.random() * 10 % 2);
		
		if (num == randNum) {
			System.out.println("The random number is " + randNum);
			System.out.print("Your guess is right. ");
		}
		else {
			System.out.println("The random number is " + randNum);
			System.out.print("Your guess is wrong. ");
		}
	}

}
