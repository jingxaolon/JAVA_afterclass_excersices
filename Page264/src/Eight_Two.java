import java.util.Scanner;

public class Eight_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double[][] arrayList = new double[4][4];
		System.out.print("Enter a 4-by-4 matrix row by row: ");
		int i, j;
		for (i = 0;i < arrayList.length;i++) {
			for (j = 0;j < arrayList[i].length;j++) {
				arrayList[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(arrayList));
	}

	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0.0;
		int i;
		
		for (i = 0;i < m.length;i++) {
			sum += m[i][i];
		}
		
		return sum;
	}
}
