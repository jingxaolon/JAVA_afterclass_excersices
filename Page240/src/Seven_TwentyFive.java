import java.util.Scanner;

public class Seven_TwentyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		double[] roots = new double[2];
		double[] eqn = new double[3];
		System.out.print("输入一元二次方程的系数：");
		
		int i;
		for (i = 0;i < eqn.length;i++) {
			eqn[i] = input.nextDouble();
		}
		
		System.out.print("The number of roots：" + solveQuadratic(eqn, roots));
	}

	public static int solveQuadratic(double[] eqn, double[] roots) {
		double calculate = eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2];
		roots[0] = 0.0;
		roots[1] = 0.0;
		
		if (calculate > 0) {
			roots[0] = (-eqn[1] + Math.pow(calculate, 0.5)) / (2 * eqn[0]);
			roots[1] = (-eqn[1] - Math.pow(calculate, 0.5)) / (2 * eqn[0]);
			System.out.println("The equation has two roots " + roots[0] + " and " + roots[1]);
			return 2;
		}
		else if (calculate == 0) {
			roots[0] = (-eqn[1]) / 2 * eqn[0];
			System.out.println("The equation has one roots " + roots[0]);
			return 1;
		}
		else {
			System.out.println("The equation has no real roots");
			return 0;
		}
	}
}
