import java.util.Scanner;

public class Eight_TwentyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of cities: ");
		int numCtiy = input.nextInt();
		
		//2.5 5 5.1 3 1 9 5.4 54 5.5 2.1
		System.out.print("Enter the coordinates of the cities: ");
		double[][] cities = new double[numCtiy][2];
		int i, j;
		for (i = 0;i < cities.length;i++) {
			cities[i][0] = input.nextDouble();
			cities[i][1] = input.nextDouble();
		}
		
		//calculate result
		double distanceSum = 0;
		double distanceMin = 1000000;
		int recordIndex = -1;
		
		for (i = 0;i < cities.length;i++) {
			distanceSum = 0;
			for (j = 0;j < cities.length;j++) {
				distanceSum += Math.sqrt((cities[j][0] - cities[i][0]) * (cities[j][0] - cities[i][0]) + 
						(cities[j][1] - cities[i][1]) * (cities[j][1] - cities[i][1]));
			}
			
			if (distanceSum < distanceMin) {
				distanceMin = distanceSum;
				recordIndex = i;
			}
		}
		
		System.out.println("The central city is at (" + cities[recordIndex][0] + ", " + cities[recordIndex][1] + ")");
		System.out.printf("The total distance to all other cities is %.2f", distanceMin);
	}

}
