import java.util.Scanner;

public class Eight_Nineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		
		int[][] arrayList = new int[row][column];
		
		System.out.print("Enter the array: ");
		int i, j;
		for (i = 0;i < arrayList.length;i++) {
			for (j = 0;j < arrayList[i].length;j++) {
				arrayList[i][j] = input.nextInt();
			}
		}
		
		
	}

	public static boolean isConsecutiveFour(int[][] values) {
		
		return true;
	}
}
