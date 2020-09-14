import java.util.Scanner;

public class Six_Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		
		int value = input.nextInt();
		
		displayPatten(value);
	}

	public static void displayPatten(int n) {
		int i;
		for (i = 1;i <= n;i++) {
			
			int count = n - i;
			while (count > 0) {
				System.out.print("  " + " ");
				count--;
			}
			
			for (int j = i;j > 0 ;j--) {
				System.out.print(j + "  ");
			}
			
			System.out.print("\n");
		}
	}
}
