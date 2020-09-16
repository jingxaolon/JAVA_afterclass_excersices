import java.util.Scanner;

public class Six_Seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int value = input.nextInt();
		
		printMatrix(value);
	}

	public static void printMatrix(int n) {
		int i;
		for (i = 1;i <= n;i++) {
			for (int k = 1;k <= n;k++) {
				System.out.print((int)(Math.random() * 10 % 2) + " ");
			}
			System.out.print("\n");
		}
	}
}
