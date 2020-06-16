import java.util.Scanner;

public class two_six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int ge = number % 10;
		int shi = (number / 10) % 10 ;
		int bai = number / 100;
		
		int sum = ge + shi + bai;
		
		System.out.println("The sum of the digits is " + sum);
	}

}
