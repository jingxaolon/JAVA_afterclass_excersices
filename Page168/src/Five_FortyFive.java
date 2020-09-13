import java.util.Scanner;

public class Five_FortyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		
		double sumForAverage = 0.0, sumForStandardDeviation = 0.0;
		int count = 0;
		
		double averageValue = 0.0;
		double StandardDeviationValue = 0.0;
		
		double temp;
		for (int i = 1;i <= 10;i++) {
			temp = input.nextDouble();
			
			sumForAverage += temp;
			sumForStandardDeviation += temp * temp;
			
			count++;
			
			averageValue = sumForAverage / (count * 1.0);
			StandardDeviationValue = Math.sqrt((sumForStandardDeviation - Math.pow(sumForAverage, 2) / count) / (count - 1));
		}
		System.out.print("The mean is " + averageValue);
		System.out.printf("\nThe standard deviation is %.5f", StandardDeviationValue);
	}

}
