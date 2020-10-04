import java.util.Scanner;

public class Seven_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		
		double[] getNumber = new double[10];
		double[] reverseNumber = new double[10];
		
		int i = 0;
		while (i < getNumber.length) {
			getNumber[i] = input.nextDouble();
			reverseNumber[getNumber.length - 1 - i] = getNumber[i];
			i++;
		}
		
		System.out.print("The array you entered: \n");
		printArray(getNumber);
		
		System.out.print("The array reversed: \n");
		printArray(reverseNumber);
	}

	/* print given array */
	public static void printArray(double[] array) {
		int i = 0;
		for (;i < array.length;i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
}
