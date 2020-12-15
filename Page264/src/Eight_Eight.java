import java.util.Scanner;

public class Eight_Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();

		// Create an array to store points
		double[][] points = new double[numberOfPoints][2];
		int[][] pointsSave = new int[numberOfPoints * (numberOfPoints - 1) / 2][2];
		int pointsSaveIndex = 0;
	    
		System.out.print("Enter " + numberOfPoints + " points: ");
		//0 0 1 1 -1 -1 2 2 -2 -2 -3 -3 -4 -4 5 5
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
		}

		// p1 and p2 are the indices in the points array
		int p1 = 0, p2 = 1; // Initial two points
		double shortestDistance = distance(points[p1][0], points[p1][1], 
				points[p2][0], points[p2][1]); // Initialize shortestDistance

		// Compute distance for every two points
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], 
						points[j][0], points[j][1]); // Find distance

				if (shortestDistance > distance) {
					p1 = i; // Update p1
					p2 = j; // Update p2

					shortestDistance = distance; // Update shortestDistance 
				}
			}
		}

		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				double distance = distance(points[i][0], points[i][1], 
						points[j][0], points[j][1]); 

				if (shortestDistance == distance) {
					pointsSave[pointsSaveIndex][0] = i;
					pointsSave[pointsSaveIndex++][1] = j;
				}
			}
		}
		
		pointsSave[++pointsSaveIndex][0] = pointsSave[pointsSaveIndex - 1][0];
		pointsSave[pointsSaveIndex][1] = pointsSave[pointsSaveIndex - 1][1];

		// Display result
		for (int k = 0;k < pointsSave.length - 1;k++) {
			if ((pointsSave[k][0] == pointsSave[k + 1][0]) && (pointsSave[k][1] == pointsSave[k + 1][1])) {
				break;
			}
	    	
			System.out.println("The closest two points are " + 
			"(" + points[pointsSave[k][0]][0] + ", " + points[pointsSave[k][0]][1] + ") and (" + 
					points[pointsSave[k][1]][0] + ", " + points[pointsSave[k][1]][1] + ")");
		}

		System.out.println("Their distance is " + shortestDistance);
	}

		/** Compute the distance between two points (x1, y1) and (x2, y2)*/
		public static double distance(
				double x1, double y1, double x2, double y2) {
			return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		}
}
