import java.util.Scanner;

public class Five_FortyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter numbers: ");
		int max = input.nextInt();
		int count = 1;

		int temp = -1;
		while ((temp = input.nextInt()) != 0) {
			if (temp == max) {
				count++;
				continue;
			}
			max = Math.max(temp, max);
			count = 1;
		}
		System.out.println("The largest number is: " + max);
		System.out.println("The occurrence count of the largest number is: " + count);
	}

}
