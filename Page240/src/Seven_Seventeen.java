import java.util.Scanner;

public class Seven_Seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		String[] studentName = new String[numberOfStudents];
		double[] studentScore = new double[numberOfStudents];
		
		int countStudent = 0;
		while (countStudent < numberOfStudents) {
			System.out.print("Enter the student's name and score for number " + (countStudent + 1) + ":");
			studentName[countStudent] = input.next();
			studentScore[countStudent] = input.nextDouble();
			
			countStudent++;
		}
		
//		for (int i = 0;i < numberOfStudents;i++) {
//			System.out.println("The score and name of the student: "
//					+ studentName[i] + " "
//					+ studentScore[i]);
//		}

		/* Sort by grade in reverse order */
		int[] reverseOrderList = selectSortReverseOrder(studentScore);
		
		for (int i = 0;i < reverseOrderList.length;i++) {
			System.out.println("The score and name of the student: "
					+ studentName[reverseOrderList[i]] + " "
					+ studentScore[reverseOrderList[i]]);
		}
	}

	public static int[] selectSortReverseOrder(double[] array) {
		int[] resultList = new int[array.length];
		int resultCount = 0;
		
		double[] tempList = new double[array.length];
		System.arraycopy(array, 0, tempList, 0, array.length);
		
		/* Select sort (book's way)*/
		for (int i = 0;i < array.length - 1;i++) {
			double currentMax = tempList[i];
			int currentIndex = i;
			
			for (int j = i + 1;j < array.length;j++) {
				if (currentMax < tempList[j]) {
					currentMax = tempList[j];
					currentIndex = j;
				}
			}
			
			if (currentIndex != i) {
				tempList[currentIndex] = tempList[i];
				tempList[i] = currentMax;
			}
		}
		/* Select sort (book's way)*/
		
		for (int k = 0;k < array.length;k++) {
			for (int l = 0;l < array.length;l++) {
				if (tempList[k] == array[l]) {
					resultList[resultCount++] = l;
				}
			}
		}
		
		return resultList;
	}
}
