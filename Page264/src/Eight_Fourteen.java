import java.util.Scanner;

public class Eight_Fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size for the matrix: ");
		int size = input.nextInt();
		
		int[][] arrayList = new int[size][size];
		
		int i, j;
		for (i = 0;i < arrayList.length;i++) {
			for (j = 0;j < arrayList[i].length;j++) {
				arrayList[i][j] = (int) (Math.random() * 10) % 2;
				System.out.print(arrayList[i][j]);
			}
			System.out.print("\n");
		}
		
		judgeArray(arrayList);
	}

	public static void judgeArray(int[][] board) {
		int i, j;
		int haveSame = -1;
		
		int rowCount = 0;
		for (i = 0;i < board.length;i++) {
			haveSame = 1;
			for (j = 0;j < board[i].length - 1;j++) {
				if (board[i][j] != board[i][j + 1]) {
					haveSame = 0;
					break;
				}
			}
			
			if (haveSame == 1) {
				rowCount++;
				System.out.println("All " + board[i][0] + "s on row " + i);
			}
		}
		
		if (rowCount == 0) {
			System.out.println("No same numbers on a row");
		}
		
		//分割线
		int columnCount = 0;
		for (j = 0;j < board[0].length;j++) {
			haveSame = 1;
			for (i = 0;i < board.length - 1;i++) {
				if (board[i][j] != board[i + 1][j]) {
					haveSame = 0;
					break;
				}
			}
			
			if (haveSame == 1) {
				columnCount++;
				System.out.println("All " + board[0][j] + "s on column " + j);
			}
		}
		
		if (columnCount == 0) {
			System.out.println("No same numbers on a column");
		}
		
		//分割线
		int majorDiagonalCount = 0;
		for (i = 0;i < board.length - 1;i++) {
			haveSame = 1;
			if (board[i][i] != board[i + 1][i + 1]) {
				haveSame = 0;
				break;
			}
		}
		
		if (haveSame == 1) {
			majorDiagonalCount++;
			System.out.println("All " + board[i][i] + "s on the major diagonal");
		}
		
		if (majorDiagonalCount == 0) {
			System.out.println("No same numbers on the major diagonal");
		}
		
		//分割线
		int subDiagonalCount = 0;
		for (i = 0;i < board.length - 1;i++) {
			haveSame = 1;
			if (board[i][board.length - 1 - i] != board[i + 1][board.length - 1 - (i + 1)]) {
				haveSame = 0;
				break;
			}
		}
		
		if (haveSame == 1) {
			subDiagonalCount++;
			System.out.println("All " + board[i][i] + "s on the sub-diagonal");
		}
		
		if (subDiagonalCount == 0) {
			System.out.println("No same numbers on the sub-diagonal");
		}
	}
	
}
