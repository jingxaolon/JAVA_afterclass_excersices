import java.util.Scanner;

public class Eight_ThirtyFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 6 points: ");
		double[][] points = new double[6][2];
		
		//1.5 2.5 -3 4.5 5.6 -7 6.5 -7 8 1 10 2.5
		int i, j;
		for (i = 0;i < points.length;i++) {
			for (j = 0;j < points[i].length;j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		//find the rightmost lowest point
		double maxDistance = 0.0;
		int maxIndex = -1;
		
		for (i = 0;i < points.length;i++) {
			double tmpDistance = 0.0;
				
			if (points[i][0] <= 0 || points[i][1] >= 0) {
				continue;
			}
			else {
				tmpDistance = Math.pow((Math.pow(points[i][0], 2)) + (Math.pow(points[i][1], 2)), 0.5);
				
				if (tmpDistance > maxDistance) {
					maxDistance = tmpDistance;
					maxIndex = i;
				}
			}
		}
		
		System.out.print("The rightmost lowest point is " + "(" + points[maxIndex][0] + ", " + points[maxIndex][1] + ")");
	}

}
