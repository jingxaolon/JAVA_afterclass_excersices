import java.util.Scanner;

public class Eight_Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		
		double[][] arrayList = new double[row][column];
		
		//23.5 35 2 10
		//4.5 3 45 3.5
		//35 44 5.5 9.6
		System.out.print("Enter the array: ");
		int i, j;
		for (i = 0;i < arrayList.length;i++) {
			for (j = 0;j < arrayList[i].length;j++) {
				arrayList[i][j] = input.nextDouble();
			}
		}
		
		int[] resultList = locateLargest(arrayList);
		System.out.print("The location of the largest element is at (" + resultList[0] + ", " + resultList[1] + ")");
	}

	public static int[] locateLargest(double[][] a) {
		int[] tmp = new int[2];
		
		double maxElement = 0;
		
		int i, j;
		for (i = 0;i < a.length;i++) {
			for (j = 0;j < a[i].length;j++) {
				if (a[i][j] > maxElement) {
					maxElement = a[i][j];
					tmp[0] = i;
					tmp[1] = j;
				}
			}
		}
		
		return tmp;
	}
}
