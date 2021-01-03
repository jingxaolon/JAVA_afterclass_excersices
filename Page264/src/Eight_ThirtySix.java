import java.util.Scanner;

public class Eight_ThirtySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number n: ");
		int num = input.nextInt();
		char maxChar = (char)((int)'A' + num - 1);
		
		char[][] list1 = new char[num][num];
		
		int i, j;
		int wrongInput = 0;
		for (i = 0;i < list1.length;i++) {
			for (j = 0;j < list1[i].length;j++) {
				list1[i][j] = input.next().charAt(0);
				
				if (list1[i][j] > maxChar)
					wrongInput = 1;
			}
			
			if (wrongInput == 1) {
				System.out.print("Wrong input: the letters must be from A to " + maxChar);
				System.exit(1);
			}
			wrongInput = 0;
		}
		
		//calculate result
		if (isLatinsquare(list1)) {
			System.out.print("The input array is a Latin square");
		}
		else {
			System.out.print("The input array is not a Latin square");
		}
	}

	public static boolean isLatinsquare(char[][] list1) {	
		int i, j;
		for (i = 0;i < list1.length;i++) {
			for (j = 0;j < list1[i].length;j++) {
				if (!isAlone(i, j, list1)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static boolean isAlone(int i, int j, char[][] list1) {	
		//在行中是唯一的
		for (int column = 0;column < list1[0].length;column++) {
			if (column != j && list1[i][column] == list1[i][j])
				return false;
		}
		
		//在列中是唯一的
		for (int row = 0;row < list1.length;row++) {
			if (row != i && list1[row][j] == list1[i][j])
				return false;
		}

		return true;
	}
}
