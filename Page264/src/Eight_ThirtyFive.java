import java.util.Scanner;

public class Eight_ThirtyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numeber of rows in the matrix: ");
		int row = input.nextInt();
		int[][] list1 = new int[row][row];
		
		System.out.println("Enter the matrix row by row: ");
		int i, j;
		for (i = 0;i < list1.length;i++) {
			for (j = 0;j < list1[i].length;j++) {
				list1[i][j] = input.nextInt();
			}
		}
		
		int[] resultList = findLargestBlock(list1);
		System.out.println("The maximum square submatrix is at (" + resultList[0] + ", " + resultList[1] + ") with size " + resultList[2]);
	}

	public static int[] findLargestBlock(int[][] m) {
		int[] resultList = new int[3];
		
		return resultList;
	}
}
