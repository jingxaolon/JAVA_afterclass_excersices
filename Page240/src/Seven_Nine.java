import java.util.Scanner;

public class Seven_Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double[] tenArray = new double[10];
		
		int i = 0;
		while (i < tenArray.length) {
			tenArray[i++] = input.nextDouble();
		}
		
		System.out.print("The minimum number is " + min(tenArray));
	}
	
	public static double min(double[] array) {
		/* Select sort (jxl's way)*/
//		double temp = 0.0;
//		
//		for (int i = 0;i < array.length;i++) {
//			for (int j = i + 1;j < array.length;j++) {
//				if (array[j] < array[i]) {
//					temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//				}
//			}
//		}
		/* Select sort (jxl's way)*/
		
		
		/* Select sort (book's way)*/
		for (int i = 0;i < array.length - 1;i++) {
			double currentMin = array[i];
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
