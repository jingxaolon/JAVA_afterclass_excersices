import java.util.Scanner;

public class Six_ThirtyNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
			System.out.print("(" + x2 + ", " + y2 + ")" + 
					" is on the left side of the line from " + 
					"(" + x0 + ", " + y0 + ")" + " to " + "(" + x2 + ", " + y2 + ")");
		}
		else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
			if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
				System.out.print("(" + x2 + ", " + y2 + ")" + 
						" is on the line segment from " + 
						"(" + x0 + ", " + y0 + ")" + " to " + "(" + x2 + ", " + y2 + ")");
			}
			else {
				System.out.print("(" + x2 + ", " + y2 + ")" + 
						" is on the same line from " + 
						"(" + x0 + ", " + y0 + ")" + " to " + "(" + x2 + ", " + y2 + ")");
			}
		}
		else {
			System.out.print("(" + x2 + ", " + y2 + ")" + 
					" is on the right side of the line from " + 
					"(" + x0 + ", " + y0 + ")" + " to " + "(" + x2 + ", " + y2 + ")");
		}
	}

	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double result = (x1 -x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		if (result <= 0)
			return false;
		
		return true;
	}
	
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double result = (x1 -x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		if (result != 0)
			return false;
		
		return true;
	}

	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
		/* Calculate the sum of the distance to two points */
		double distance1 = 0.0;
		double distance2 = 0.0;
		double distanceBetweenTwoPoints = 0.0;

		distance1 = Math.pow((Math.pow((x2 - x0), 2) + Math.pow((y2 - y0), 2)), 0.5);
		distance2 = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
		distanceBetweenTwoPoints = Math.pow((Math.pow((x1 - x0), 2) + Math.pow((y1 - y0), 2)), 0.5);
		
		if (distance1 + distance2 != distanceBetweenTwoPoints)
			return false;
		
		return true;
	}
}
