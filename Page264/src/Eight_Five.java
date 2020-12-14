import java.util.Scanner;

public class Eight_Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		double[][] arrayList1 = new double[3][3];
		double[][] arrayList2 = new double[3][3];
		
		System.out.print("Enter matrix1: ");
		int i, j;
		for (i = 0;i < arrayList1.length;i++) {
			for (j = 0;j < arrayList1[i].length;j++) {
				arrayList1[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("Enter matrix2: ");
		for (i = 0;i < arrayList2.length;i++) {
			for (j = 0;j < arrayList2[i].length;j++) {
				arrayList2[i][j] = input.nextDouble();
			}
		}
		
		double[][] resultList = addMatrix(arrayList1, arrayList2);
		//1 2 3 4 5 6 7 8 9
		//0 2 4 1 4.5 2.2 1.1 4.3 5.2
		
		System.out.println("The matrices are added as follows ");
		System.out.printf("%.1f %.1f %.1f", arrayList1[0][0], arrayList1[0][1], arrayList1[0][2]);
		System.out.print("\t\t");
		System.out.printf("%.1f %.1f %.1f", arrayList2[0][0], arrayList2[0][1], arrayList2[0][2]);
		System.out.print("\t\t");
		System.out.printf("%.1f %.1f %.1f\n", resultList[0][0], resultList[0][1], resultList[0][2]);
		
		System.out.printf("%.1f %.1f %.1f", arrayList1[1][0], arrayList1[1][1], arrayList1[1][2]);
		System.out.print("\t+\t");
		System.out.printf("%.1f %.1f %.1f", arrayList2[1][0], arrayList2[1][1], arrayList2[1][2]);
		System.out.print("\t=\t");
		System.out.printf("%.1f %.1f %.1f\n", resultList[1][0], resultList[1][1], resultList[1][2]);
		
		System.out.printf("%.1f %.1f %.1f", arrayList1[2][0], arrayList1[2][1], arrayList1[2][2]);
		System.out.print("\t\t");
		System.out.printf("%.1f %.1f %.1f", arrayList2[2][0], arrayList2[2][1], arrayList2[2][2]);
		System.out.print("\t\t");
		System.out.printf("%.1f %.1f %.1f\n", resultList[2][0], resultList[2][1], resultList[2][2]);
	}

	
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double [][] tmpList = new double[a.length][a[0].length];
		
		int i, j;
		for (i = 0;i < tmpList.length;i++) {
			for (j = 0;j < tmpList[0].length;j++) {
				tmpList[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return tmpList;
	}
}
