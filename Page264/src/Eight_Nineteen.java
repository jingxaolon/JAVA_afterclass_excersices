import java.util.Scanner;

public class Eight_Nineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		
		int[][] arrayList = new int[row][column];
		
		System.out.println("Enter the array: ");
		int i, j;
		for (i = 0;i < arrayList.length;i++) {
			for (j = 0;j < arrayList[i].length;j++) {
				arrayList[i][j] = input.nextInt();
				System.out.print(arrayList[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		//calculate result
		if (isConsecutiveFour(arrayList)) {
			System.out.print("The array has consecutive four");
		}
		else {
			System.out.print("The array doesn't have consecutive four");
		}
	}

	public static boolean isConsecutiveFour(int[][] values) {
		int i, j;
		
		//行上是否有连续的4个数字
		for (i = 0;i < values.length;i++) {	//遍历每行
			for (j = 0;j <= values[i].length - 4;j++) {
				if ((values[i][j] == values[i][j + 1]) && (values[i][j + 1] == values[i][j + 2]) && 
						(values[i][j + 2] == values[i][j + 3])) {
					return true;
				}
			}
		}
		
		//列上是否有连续的4个数字
		for (i = 0;i < values[0].length;i++) {	//遍历每列
			for (j = 0;j <= values.length - 4;j++) {
				if ((values[j][i] == values[j + 1][i]) && (values[j + 1][i] == values[j + 2][i]) && 
						(values[j + 2][i] == values[j + 3][i])) {
					return true;
				}
			}
		}
		
		//正对角线上是否有连续的4个数字
		for (i = 0;i <= values.length - 4;i++) {
			for (j = 0;j <= values[i].length - 4;j++) {
				if ((values[i][j] == values[i + 1][j + 1]) && (values[i + 1][j + 1] == values[i + 2][j + 2]) && 
						(values[i + 2][j + 2] == values[i + 3][j + 3])) {
					return true;
				}
			}
		}
		
		//非正对角线上是否有连续的4个数字
		for (i = 0;i <= values.length - 4;i++) {
			for (j = values[i].length - 1;j > values[i].length - 4;j--) {
				if ((values[i][j] == values[i + 1][j - 1]) && (values[i + 1][j - 1] == values[i + 2][j - 2]) && 
						(values[i + 2][j - 2] == values[i + 3][j - 3])) {
					return true;
				}
			}
		}
		
		return false;
	}
}
