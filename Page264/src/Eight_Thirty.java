import java.util.Scanner;

public class Eight_Thirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a00, a01, a10, a11, b0, b1:");
		double[][] listA = new double[2][2];
		double[] listB = new double[2];
		double[] resultList;
		
		int i, j;
		for (i = 0;i < listA.length;i++) {
			for (j = 0;j < listA[i].length;j++) {
				listA[i][j] = input.nextDouble();
			}
		}
		
		for (i = 0;i < listB.length;i++) {
			listB[i] = input.nextDouble();
		}
		
		if ((resultList = linearEquation(listA, listB)) == null) {
			System.out.println("The equation has no solution");
		}
		else {
			System.out.println("x is " + resultList[0] + " and " + "y is " + resultList[1]);
		}
	}

	public static double[] linearEquation(double[][] a, double[]b) {
		double[] resultList = new double[2];
		
		double fenmu = a[0][0] * a[1][1] - a[0][1] * a[1][0];
		
		double fenzi1 = b[0] * a[1][1] - b[1] * a[0][1];
		double fenzi2 = b[1] * a[0][0] - b[0] * a[1][0];
		
		if (fenmu == 0) {
			return null;
		}
		else {
			resultList[0] = fenzi1 / fenmu;
			resultList[1] = fenzi2 / fenmu;
		}
		
		return resultList;
	}
}
