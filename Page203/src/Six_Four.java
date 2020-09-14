import java.util.Scanner;

public class Six_Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		
		int value = input.nextInt();
		
		System.out.print("Inverse number: ");
		reverse(value);
	}

	public static void reverse(int number) {
		String temp = "";
		
		while (number % 10 != 0) {
			temp += number % 10;
			number /= 10;
		}
		
		System.out.print(temp);
	}
}
