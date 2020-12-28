import java.util.Scanner;

public class Eight_TwentySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		//0.15 0.875 0.375
		//0.55 0.005 0.225
		//0.30 0.12 0.4
		System.out.println("Enter a 3-by-3 matrix row by row:");
		double[][] m1 = new double[3][3];
		
		int i, j;
		for (i = 0;i < m1.length;i++) {
			for (j = 0;j < m1[i].length;j++) {
				m1[i][j] = input.nextDouble();
			}
		}

		System.out.print("\nThe column-sorted array is\n");
		m1 = sortRows(m1);
		for (i = 0;i < m1.length;i++) {
			for (j = 0;j < m1[i].length;j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public static double[][] sortRows(double[][] m1) {
		int i, j;
		double temp = 0;

		for (i = 0;i < m1[0].length;i++) {
			for (j = 0;j < m1.length - 1;j++) {
				for (int k = j + 1;k < m1.length;k++) {
					if (m1[j][i] > m1[k][i]) {
						temp = m1[j][i];
						m1[j][i] = m1[k][i];
						m1[k][i] = temp;
					}
				}
			}
		}
		
		return m1;
	}
}
