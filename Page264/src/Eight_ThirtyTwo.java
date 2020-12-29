import java.util.Scanner;

public class Eight_ThirtyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
		double[][] points = new double[3][2];
		
		int i, j;
		for (i = 0;i < points.length;i++) {
			for (j = 0;j < points[i].length;j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		double areaGet = getTriangleArea(points);
		if (areaGet == 0) {
			System.out.println("The three points are on the same line");
		}
		else {
			System.out.println("The area of the triangle is " + areaGet);
		}
	}

	public static double getTriangleArea(double[][] points) {
		if (((points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) - (points[2][0] - points[0][0]) * (points[1][1] - points[0][1])) == 0) {
			return 0;
		}
		
		double side1 = Math.pow((Math.pow((points[1][0] - points[0][0]), 2) + Math.pow((points[1][1] - points[0][1]), 2)), 0.5);
		double side2 = Math.pow((Math.pow((points[2][0] - points[0][0]), 2) + Math.pow((points[2][1] - points[0][1]), 2)), 0.5);
		double side3 = Math.pow((Math.pow((points[2][0] - points[1][0]), 2) + Math.pow((points[2][1] - points[1][1]), 2)), 0.5);
		
		double s = (side1 + side2 + side3) / 2;
		
		double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
		
		return area;
	}
}
