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
        int playerCount = 0;	//����Ϊ0, red; ����Ϊ1, yellow; 
        int boardIndex = -1;
        char result = 'N';
        while (true) {
        	printChessBoard(board);
        	System.out.print("Drop a " + player[playerCount++ % 2] + " disk at column (0-6): ");
        	boardIndex = input.nextInt();
        	int rowLocation = -1;
        	
        	//����֮ǰ��Ҫ�����ж�
        	//1. �����ж������Ƿ�����		2.����δ��, �����ж��Ƿ����ظ�λ��	3. �������Ӻ�, �ж��Ƿ��ʤ
        	if (!judgeChessboardIsFull(board)) {	//����δ��
        		rowLocation = determineInsertLocation(board, boardIndex);
        		if (rowLocation >= 0) {	//����δ�����в���λ�ò��ظ�
        			board[rowLocation][boardIndex] = Character.toUpperCase(player[(playerCount - 1) % 2].charAt(0));
        			
        			result = judgeWinner(board);
        			if (result == 'R') {	//�ж��Ƿ��ʤ
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
        	else {	//��������
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
		
		//�����Ƿ���������4������
		for (i = 0;i < board.length;i++) {	//����ÿ��
			for (j = 0;j <= board[i].length - 4;j++) {
				if (board[i][j] != ' ' && (board[i][j] == board[i][j + 1]) && (board[i][j + 1] == board[i][j + 2]) && 
						(board[i][j + 2] == board[i][j + 3])) {
					return board[i][j];
				}
			}
		}
		
		//�����Ƿ���������4������
		for (i = 0;i < board[0].length;i++) {	//����ÿ��
			for (j = 0;j <= board.length - 4;j++) {
				if (board[j][i] != ' ' && (board[j][i] == board[j + 1][i]) && (board[j + 1][i] == board[j + 2][i]) && 
						(board[j + 2][i] == board[j + 3][i])) {
					return board[j][i];
				}
			}
		}
		
		//���Խ������Ƿ���������4������
		for (i = 0;i <= board.length - 4;i++) {
			for (j = 0;j <= board[i].length - 4;j++) {
				if (board[i][j] != ' ' && (board[i][j] == board[i + 1][j + 1]) && (board[i + 1][j + 1] == board[i + 2][j + 2]) && 
						(board[i + 2][j + 2] == board[i + 3][j + 3])) {
					return board[i][j];
				}
			}
		}
		
		//�����Խ������Ƿ���������4������
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
