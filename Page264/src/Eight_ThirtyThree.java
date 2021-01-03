import java.util.Scanner;

public class Eight_ThirtyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double[][] points = new double[4][2];
		
		int i, j;
		for (i = 0;i < points.length;i++) {
			for (j = 0;j < points[i].length;j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		//calculate result
		//1. 求出交点
		double[] intersectionPoints = getIntersectingPoint(points[0][0], points[0][1], points[2][0], points[2][1], points[1][0], points[1][1], points[3][0], points[3][1]);
		double[] area = new double[4];
		
		double[][] area1 = {{points[0][0], points[0][1]}, {points[1][0], points[1][1]}, {intersectionPoints[0], intersectionPoints[1]}};
		area[0] = Eight_ThirtyTwo.getTriangleArea(area1);
		
		double[][] area2 = {{points[1][0], points[1][1]}, {points[2][0], points[2][1]}, {intersectionPoints[0], intersectionPoints[1]}};
		area[1] = Eight_ThirtyTwo.getTriangleArea(area2);
		
		double[][] area3 = {{points[2][0], points[2][1]}, {points[3][0], points[3][1]}, {intersectionPoints[0], intersectionPoints[1]}};
		area[2] = Eight_ThirtyTwo.getTriangleArea(area3);
		
		double[][] area4 = {{points[3][0], points[3][1]}, {points[0][0], points[0][1]}, {intersectionPoints[0], intersectionPoints[1]}};
		area[3] = Eight_ThirtyTwo.getTriangleArea(area4);
		
		for (i = 0;i < area.length - 1;i++) {
			for (j = i + 1;j < area.length;j++) {
				if (area[i] > area[j]) {
					double tmp = area[i];
					area[i] = area[j];
					area[j] = tmp;
				}
			}
		}
		
		System.out.print("The areas are ");
		for (i = 0;i < area.length;i++) {
			System.out.print(area[i] + " ");
		}
	}

	public static double[] getIntersectingPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		double a = y1 - y2;
		double b = -(x1 - x2);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double c = y3 - y4;
		double d = -(x3 - x4);
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		double[] resultList = new double[2];

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
