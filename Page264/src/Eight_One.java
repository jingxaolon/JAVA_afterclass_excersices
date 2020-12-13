import java.util.Scanner;

public class Eight_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		double[][] arrayList = new double[3][4];
		System.out.print("Enter a 3-by-4 matrix row by row: ");
		int i, j;
		for (i = 0;i < arrayList.length;i++) {
			for (j = 0;j < arrayList[i].length;j++) {
				arrayList[i][j] = input.nextDouble();
			}
		}

		//call sumColumn
		for (j = 0;j < arrayList[0].length;j++) {
			System.out.println("Sum of the elements at column " + j + " is " + sumColumn(arrayList, j));
		}
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0.0;
		int i;
		
		for (i = 0;i < m.length;i++) {
			sum += m[i][columnIndex];
		}
		
		return sum;
	}
}
