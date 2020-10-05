import java.util.Scanner;

public class Seven_Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the scores between 1 and 100, "
				+ "enter a negative number to indicate the end: ");
		
		double[] scoresList = new double[100];
		
		int higherScores = 0;
		int lowerScores = 0;
		double sum = 0.0, avg = 0.0;
		
		scoresList[0] = input.nextDouble();
		
		int i = 0;
		while (scoresList[i] > 0) {
			sum += scoresList[i];
			scoresList[++i] = input.nextDouble();
		}
		
		avg = sum / i;
		System.out.println("Average score: " + avg);
		
		for (int j = 0;j < i;j++) {
			if (scoresList[j] >= avg) {
				higherScores++;
			}
			else {
				lowerScores++;
			}
		}
		
		System.out.println("Number of scores above average: " + higherScores);
		System.out.println("Number of scores below average: " + lowerScores);
	}

}
