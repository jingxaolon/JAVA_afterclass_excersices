import java.util.Scanner;

public class Eight_Fifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter five points: ");
		double[][] points = new double[5][2];
		
		int i;
		for (i = 0;i < points.length;i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}
		
		if (sameLine(points)) {
			System.out.print("The five points are on the same line");
		}
		else {
			System.out.print("The five points are not on the same line");
		}
	}

	public static boolean sameLine(double[][] points) {
		int i;
		for (i = 0;i < points.length - 3;i++) {
			if (onTheSameLine(points[i][0], points[i][1],points[i + 1][0],points[i + 1][0],points[i + 2][0],points[i + 2][0])) {
				continue;
			}
			else {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double result = (x1 -x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		if (result != 0)
			return false;
		
		return true;
	}
}
