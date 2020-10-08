import java.util.Scanner;

public class Seven_Twenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double[] tenArray = new double[10];
		
		int i = 0;
		while (i < tenArray.length) {
			tenArray[i++] = input.nextDouble();
		}
		
		System.out.print("\nPrint the list before sort ");
		for (i = 0;i < tenArray.length;i++) {
			System.out.print(tenArray[i] + " ");
		}
		System.out.print("\n");
		
		selectionSort2(tenArray);
		
		System.out.print("\nPrint the list after sort ");
		for (i = 0;i < tenArray.length;i++) {
			System.out.print(tenArray[i] + " ");
		}
		System.out.print("\n");
	}

	public static void selectionSort2(double[] list) {
		for (int i = list.length - 1; i > 0; i--) {
			double currentMax = list[i];
			int currentMaxIndex = i;

			for (int j = i - 1; j >= 0; j--) {
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}

			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
}
