import java.util.Scanner;

public class Eight_TwentyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		//0.15 0.875 0.375
		//0.55 0.005 0.225
		//0.30 0.12 0.4
		
		//0.95 -0.875 0.375
		//0.65 0.005 0.225
		//0.30 0.22 -0.4
		System.out.println("Enter a 3-by-3 matrix row by row:");
		double[][] m1 = new double[3][3];
		
		int i, j;
		for (i = 0;i < m1.length;i++) {
			for (j = 0;j < m1[i].length;j++) {
				m1[i][j] = input.nextDouble();
			}
		}
		
		 System.out.println(isMarkovMatrix(m1) ? "It is a Markov matrix" 
		    		: "It is not a Markov matrix");
	}

	public static boolean isMarkovMatrix(double[][] m1) {
		final double EPSILON = 10E-14;
		int i, j;
		double columnSum = 0.0;
		
		for (i = 0;i < m1[0].length;i++) {
			for (j = 0;j < m1.length;j++) {
				if (m1[j][i] < 0) {
					return false;
				}
				else {
					columnSum += m1[j][i];
				}
			}
			
			if (Math.abs(columnSum - 1.0) < EPSILON) {
				columnSum = 0.0;
				continue;
			}
			else {
				return false;
			}
		}
		
		return true;
	}
}
