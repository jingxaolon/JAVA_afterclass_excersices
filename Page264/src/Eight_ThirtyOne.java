import java.util.Scanner;

public class Eight_ThirtyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double[][] points = new double[4][2];
		double[] resultList;
		
		int i, j;
		for (i = 0;i < points.length;i++) {
			for (j = 0;j < points[i].length;j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		//
		if ((resultList = getIntersectingPoint(points)) == null) {
			System.out.println("The two lines are parallel ");
		}
		else {
			System.out.println("The intersecting point is at (" + resultList[0] + ", " + resultList[1] + ")");
		}
	}

	public static double[] getIntersectingPoint(double[][] points) {
		double[] resultList = new double[2];
		
		double a = points[0][1] - points[1][1];
		double b = -(points[0][0] - points[1][0]);
		double e = a * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
		double c = points[2][1] - points[3][1];
		double d = -(points[2][0] - points[3][0]);
		double f = c * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
		
		//double x = (e * d - b * f) / (a * d - b * c);
		//double y = (a * f - e * c) / (a * d - b * c);
		
		if ((a * d - b * c) == 0) {
			return null;
		}
		else {
			resultList[0] = (e * d - b * f) / (a * d - b * c);
			resultList[1] = (a * f - e * c) / (a * d - b * c);
			return resultList;
		}
	}
}
