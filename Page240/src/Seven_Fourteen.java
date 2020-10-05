import java.util.Scanner;

public class Seven_Fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 numbers: ");
		int[] fiveArray = new int[5];
		
		int i = 0;
		while (i < fiveArray.length) {
			fiveArray[i++] = input.nextInt();
		}
		
		System.out.print("The greatest common divisor of these numbers ( ");
		
		for (int j = 0;j < fiveArray.length;j++) {
			System.out.print(fiveArray[j] + " ");
		}
		System.out.print(") is: " + gcd(fiveArray));
	}

	/* Exhaustive method */
	public static int gcd(int... numbers) {
		/* first: find the smallest element in the array */
		int smallestElement = min(numbers);
		
		int startNumber;
		int currentGcd = 1;
		for (startNumber = 1;startNumber <= smallestElement;startNumber++) {
			int i;
			
			for (i = 0;i < numbers.length;i++) {
				if (numbers[i] % startNumber != 0) {
					break;
				}
			}
			
			if (i == numbers.length) {
				currentGcd = startNumber;
			}
		}

		return currentGcd;
	}
	
	public static int min(int[] array) {
		/* Select sort (book's way)*/
		for (int i = 0;i < array.length - 1;i++) {
			int currentMin = array[i];
			int currentIndex = i;
			
			for (int j = i + 1;j < array.length;j++) {
				if (currentMin > array[j]) {
					currentMin = array[j];
					currentIndex = j;
				}
			}
			
			if (currentIndex != i) {
				array[currentIndex] = array[i];
				array[i] = currentMin;
			}
		}
		/* Select sort (book's way)*/
		
		return array[0];
	}
}
