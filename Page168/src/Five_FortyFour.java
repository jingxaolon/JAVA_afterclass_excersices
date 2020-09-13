import java.util.Scanner;

public class Five_FortyFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int value = input.nextInt();

		System.out.print("The 16 bits are ");
		int mask = 1;
		for (int i = 15; i >= 0; i--) {
			int temp = value >> i;
			int bit = temp & mask;
			System.out.print(bit);
		}
	}

}
