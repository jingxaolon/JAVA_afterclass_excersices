import java.util.Scanner;

public class Seven_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		System.out.print("Enter " + numberOfStudents + " scores: ");
		
		/* get student's scores*/
		double[] arrayScore = new double[numberOfStudents];
		arrayScore = getScores(arrayScore, input);

		/* get student's highest scores*/
		double highestScore = getHighestScores(arrayScore);
		
		/* print result*/
		for (int k = 0;k < arrayScore.length;k++) {
			if (arrayScore[k] >= highestScore - 10) {
				System.out.print("Student " + k + " score " + "is " + arrayScore[k] + " and grade is " + "A\n");
			}
			else if (arrayScore[k] >= highestScore - 20) {
				System.out.print("Student " + k + " score " + "is " + arrayScore[k] + " and grade is " + "B\n");
			}
			else if (arrayScore[k] >= highestScore - 30) {
				System.out.print("Student " + k + " score " + "is " + arrayScore[k] + " and grade is " + "C\n");
			}
			else if (arrayScore[k] >= highestScore - 40) {
				System.out.print("Student " + k + " score " + "is " + arrayScore[k] + " and grade is " + "D\n");
			}
		}
	}

	/* get student's scores */
	public static double[] getScores(double[] scores, Scanner input) {		
		int i = 0;
		while (i < scores.length) {
			scores[i] = input.nextDouble();
			i++;
		}
		
		return scores;
	}
	
	/* get student's highest scores*/
	public static double getHighestScores(double[] scores) {
		double highestScore = scores[0];
		
		for (int j = 1;j < scores.length;j++) {
			if (scores[j] > highestScore)
				highestScore = scores[j];
		}	
		
		return highestScore;
	}
	
}
