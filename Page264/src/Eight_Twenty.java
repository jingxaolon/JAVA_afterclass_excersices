import java.util.Scanner;

public class Eight_Twenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        char[][] board = new char[6][7];
        String[] player = {"red", "yellow"};

        //start game
        int playerCount = 0;	//余数为0, red; 余数为1, yellow; 
        int boardIndex = -1;
        while (true) {
        	printChessBoard(board);
        	System.out.print("Drop a " + player[playerCount++ % 2] + " disk at column (0-6): ");
        	boardIndex = input.nextInt();
        	
        	
        	break;
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
	}
}
