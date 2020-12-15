import java.util.Scanner;

public class Eight_Eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: ");
		int number = input.nextInt();
		
		int[][] arrayList = new int[3][3];
		
		int i, j;
		for (i = arrayList.length - 1;i >= 0;i--) {
			for (j = arrayList[i].length - 1;j >= 0;j--) {
				arrayList[i][j] = number % 2;
				number /= 2;
			}
		}
		
		for (i = 0;i < arrayList.length;i++) {
			for (j = 0;j < arrayList[i].length;j++) {
				if (arrayList[i][j] == 0) {
					System.out.print("H ");
				}
				else {
					System.out.print("T ");
				}
			}
			System.out.print("\n");
		}
	}

}
