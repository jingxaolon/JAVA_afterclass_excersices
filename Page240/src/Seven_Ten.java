import java.util.Scanner;

public class Seven_Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double[] tenArray = new double[10];
		
		int i = 0;
		while (i < tenArray.length) {
			tenArray[i++] = input.nextDouble();
		}
		
		System.out.print("The minimum number's index is " + indexOfSmallestElement(tenArray));
	}

	public static int indexOfSmallestElement(double[] array) {
		double currentMin = array[0];
		int currentIndex = 0;
		for (int i = 1;i < array.length;i++) {
			if (currentMin > array[i]) {
				currentMin = array[i];
				currentIndex = i;
			}
		}
		
		return currentIndex;
	}
}
