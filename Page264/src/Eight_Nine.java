import java.util.Scanner;

public class Eight_Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		char[][] board = {{'|', '\t', '|', '\t', '|', '\t', '|'}, 
						  {'|', '\t', '|', '\t', '|', '\t', '|'}, 
					   	  {'|', '\t', '|', '\t', '|', '\t', '|'}};
		
		//print the board
		printBoard(board);
		
		//start game
		int count = 1;
		int rowIndex = -1;
		int columnIndex = -1;
		
		while (!judgeToWin(board) && !judgeChessboardIsFull(board)) {
			if (count % 2 == 1) {	//player x first.
				System.out.print("Enter a row (0, 1, or 2) for player X: ");
				rowIndex = input.nextInt();
				
				System.out.print("Enter a column (0, 1, or 2) for player X: ");
				columnIndex = input.nextInt();
				
				switch(columnIndex) {
				case 0:columnIndex += 1;break;
				case 1:columnIndex += 2;break;
				case 2:columnIndex += 3;break;
				}
				
				board[rowIndex][columnIndex] = 'X';
				printBoard(board);
			}
			else {	//player o
				System.out.print("Enter a row (0, 1, or 2) for player O: ");
				rowIndex = input.nextInt();
				
				System.out.print("Enter a column (0, 1, or 2) for player O: ");
				columnIndex = input.nextInt();
				
				switch(columnIndex) {
				case 0:columnIndex += 1;break;
				case 1:columnIndex += 2;break;
				case 2:columnIndex += 3;break;
				}
				
				board[rowIndex][columnIndex] = 'O';
				printBoard(board);
			}
			
			count++;
		}
		
		//print winner
		if ((count - 1) % 2 == 1) {
			System.out.print("X player won!");
		}
		else {
			System.out.print("O player won!");
		}
		
	}

	public static void printBoard(char[][] board) {
		//print the board
		System.out.println("-------------------------");
		int i, j;
		for (i = 0;i < board.length;i++) {
			for (j = 0;j < board[0].length;j++) {
				if ((j == 1 || j == 3 || j == 5) && board[i][j] != '\t') {
					System.out.print(board[i][j] + "\t");
				}
				else {
					System.out.print(board[i][j]);
				}
			}
			System.out.println();
			System.out.println("-------------------------");
		}
	}
	
	public static boolean judgeToWin(char[][] board) {
		//要获胜，需要判断7条路径
		int i;
		for (i = 0;i < board.length;i++) {
			if (i == 0) {	//需要多判断一个对角线
				if ((board[i][1] == 'X' && board[i][3] == 'X' && board[i][5] == 'X') || 
						(board[i][1] == 'O' && board[i][3] == 'O' && board[i][5] == 'O')) {
					return true;
				}
				
				if ((board[i][1] == 'X' && board[i + 1][3] == 'X' && board[i + 2][5] == 'X') || 
						(board[i][1] == 'O' && board[i + 1][3] == 'O' && board[i + 2][5] == 'O')) {	//对角线
					return true;
				}
			}
			else {
				if ((board[i][1] == 'X' && board[i][3] == 'X' && board[i][5] == 'X') || 
						(board[i][1] == 'O' && board[i][3] == 'O' && board[i][5] == 'O')) {
					return true;
				}
			}
		}
		
		for (i = 0;i < board[0].length;i++) {	//列
			if ((board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') || 
					(board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O')) {
				return true;
			}
		}

		return false;
	}
	
	public static boolean judgeChessboardIsFull(char[][] board) {
		int i, j;
		for (i = 0;i < board.length;i++) {
			for (j = 1;j < board[0].length;j += 2) {
				if (board[i][j] == '\t') {
					return false;
				}
			}
		}
		return true;
	}
	
}
