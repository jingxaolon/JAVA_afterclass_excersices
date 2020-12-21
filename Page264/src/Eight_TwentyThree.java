import java.util.Scanner;

public class Eight_TwentyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 6-by-6 matrix row by row: ");
		int[][] m1 = new int[6][6];
		
		int i, j;
		for (i = 0;i < m1.length;i++) {
			for (j = 0;j < m1[i].length;j++) {
				m1[i][j] = input.nextInt();
			}
		}
		
		
		
	}

}
