import java.util.Scanner;

public class Eight_TwentyNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		//51 22 25 6 1 4 24 54 6
		//51 25 22 6 1 4 24 54 6
		System.out.print("Enter list1:");
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
		
		int i, j;
		for (i = 0;i < m1.length;i++) {
			for (j = 0;j < m1[i].length;j++) {
				m1[i][j] = input.nextInt();
			}
		}
		
		System.out.print("Enter list2:");
		for (i = 0;i < m2.length;i++) {
			for (j = 0;j < m2[i].length;j++) {
				m2[i][j] = input.nextInt();
			}
		}
		
		System.out.println(equals(m1, m2) ? "The two arrays are identical" : 
			"The two arrays are not identical");
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		int[][] tmp1 = new int[m1.length][m1.length];
		int[][] tmp2 = new int[m2.length][m2.length];
		
		tmp1 = m1;
		tmp2 = m2;
		sortRows(tmp1);
		sortRows(tmp2);
		
		int i, j;
		for (i = 0;i < m1.length;i++) {
			for (j = 0;j < m1[i].length;j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void sortRows(int[][] m1) {
		int i, j;
		int temp = 0;

		for (i = 0;i < m1.length;i++) {
			for (j = 0;j < m1[i].length - 1;j++) {
				for (int k = j + 1;k < m1[i].length;k++) {
					if (m1[i][j] > m1[i][k]) {
						temp = m1[i][j];
						m1[i][j] = m1[i][k];
						m1[i][k] = temp;
					}
				}
			}
		}
	}
}
