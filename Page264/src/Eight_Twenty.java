import java.util.Scanner;

public class Eight_Twenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        char[][] board = new char[6][7];
		for (int i = 0;i < board.length;i++) {
			for (int j = 0;j < board[i].length;j++) {
				board[i][j] = ' ';
			}
		}
        
        String[] player = {"red", "yellow"};

        //start game
        int playerCount = 0;	//余数为0, red; 余数为1, yellow; 
        int boardIndex = -1;
        char result = 'N';
        while (true) {
        	printChessBoard(board);
        	System.out.print("Drop a " + player[playerCount++ % 2] + " disk at column (0-6): ");
        	boardIndex = input.nextInt();
        	int rowLocation = -1;
        	
        	//落子之前先要进行判断
        	//1. 首先判断棋盘是否已满		2.棋盘未满, 继续判断是否落重复位置	3. 正常落子后, 判断是否获胜
        	if (!judgeChessboardIsFull(board)) {	//棋盘未满
        		rowLocation = determineInsertLocation(board, boardIndex);
        		if (rowLocation >= 0) {	//棋盘未满且有插入位置不重复
        			board[rowLocation][boardIndex] = Character.toUpperCase(player[(playerCount - 1) % 2].charAt(0));
        			
        			result = judgeWinner(board);
        			if (result == 'R') {	//判断是否获胜
        				printChessBoard(board);
        				System.out.println("The red player won");
        				System.exit(1);
        			}
        			else if (result == 'Y'){
        				printChessBoard(board);
        				System.out.println("The yellow player won");
        				System.exit(1);
        			}
        		}
        		else {
        			System.out.println("The location is set! Drop again!");
        			playerCount--;
        			continue;
        		}
        	}
        	else {	//棋盘已满
        		System.out.println("The chessboard is full!");
        		System.exit(1);
        	}
        }
    }

	public static void printChessBoard(char[][] board) {
		int i, j;
		for (i = 0;i < board.length;i++) {
			for (j = 0;j < board[i].length;j++) {
				System.out.print('|');
				System.out.print(board[i][j]);
			}
			System.out.println('|');
		}
		System.out.println("---------------");
	}
	
	public static boolean judgeChessboardIsFull(char[][] board) {
		int i, j;
		for (i = 0;i < board.length;i++) {
			for (j = 0;j < board[i].length;j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}
	
	public static int determineInsertLocation(char[][] board, int boardIndex) {
		int i;
		
		for (i = board.length - 1;i >= 0;i--) {
			if (board[i][boardIndex] == ' ') {
				return i;
			}
		}
		
		return i;
	}
	
	public static char judgeWinner(char[][] board) {
		int i, j;
		
		//行上是否有连续的4个棋子
		for (i = 0;i < board.length;i++) {	//遍历每行
			for (j = 0;j <= board[i].length - 4;j++) {
				if (board[i][j] != ' ' && (board[i][j] == board[i][j + 1]) && (board[i][j + 1] == board[i][j + 2]) && 
						(board[i][j + 2] == board[i][j + 3])) {
					return board[i][j];
				}
			}
		}
		
		//列上是否有连续的4个棋子
		for (i = 0;i < board[0].length;i++) {	//遍历每列
			for (j = 0;j <= board.length - 4;j++) {
				if (board[j][i] != ' ' && (board[j][i] == board[j + 1][i]) && (board[j + 1][i] == board[j + 2][i]) && 
						(board[j + 2][i] == board[j + 3][i])) {
					return board[j][i];
				}
			}
		}
		
		//正对角线上是否有连续的4个棋子
		for (i = 0;i <= board.length - 4;i++) {
			for (j = 0;j <= board[i].length - 4;j++) {
				if (board[i][j] != ' ' && (board[i][j] == board[i + 1][j + 1]) && (board[i + 1][j + 1] == board[i + 2][j + 2]) && 
						(board[i + 2][j + 2] == board[i + 3][j + 3])) {
					return board[i][j];
				}
			}
		}
		
		//非正对角线上是否有连续的4个棋子
		for (i = 0;i <= board.length - 4;i++) {
			for (j = board[i].length - 1;j > board[i].length - 4;j--) {
				if (board[i][j] != ' ' && (board[i][j] == board[i + 1][j - 1]) && (board[i + 1][j - 1] == board[i + 2][j - 2]) && 
						(board[i + 2][j - 2] == board[i + 3][j - 3])) {
					return board[i][j];
				}
			}
		}
		
		return 'N';
	}
}
