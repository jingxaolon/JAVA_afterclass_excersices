import java.util.Scanner;

public class Eight_TwentyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 6-by-6 matrix row by row: ");
		int[][] m1 = new int[6][6];
		
		int i, j;
		for (i = 0;i < m1.length;i++) {
			for (j = 0;j < m1[i].length;j++) {
				m1[i][j] = input.nextInt();
			}
		}
		
		//calculate result
		printResult(m1);
	}

	public static void printResult(int[][] m1) {
		int i, j;
		
		/* 
		 * 思路：
		 * 先从行开始判断，哪一行不满足具有偶数个1的条件，继而判断该
		 * 行中的每一列值，判断哪个值导致了行和列都不满足偶数个1，挑出该值
		 *  */
		int count = 0;
		int recordIndex = -1;
		for (i = 0;i < m1.length;i++) {
			for (j = 0;j < m1[i].length;j++) {
				if (m1[i][j] == 1) {
					count++;
				}
			}
			
			if (count % 2 != 0) {	//不具有偶数个1的行
				recordIndex = i;
				
				for (int k = 0;k < m1[recordIndex].length;k++) {
					if (test(m1, k)) {	//该列有偶数个1，继续循环，判断下一个值
						continue;
					}
					else {	//该列不是偶数个1
						//将该值反转，确认是否影响该列的判断结果
						if (m1[recordIndex][k] == 1) {
							m1[recordIndex][k] = 0;
						}
						else {
							m1[recordIndex][k] = 1;
						}
						
						if (test(m1, k)) {
							System.out.print("The flipped cell is at (" + recordIndex + ", " + k + ")");
						}
						else {
							if (m1[recordIndex][k] == 1) {
								m1[recordIndex][k] = 0;
							}
							else {
								m1[recordIndex][k] = 1;
							}
						}
					}
				}
			}
		}
	}
	
	public static boolean test(int[][] m1, int column) {	//判断给定列是否具有偶数个1，有返回true，无返回false
		int i, j;
		int count = 0;
		
		for (i = 0;i < m1.length;i++) {
			if (m1[i][column] == 1) {
				count++;
			}
		}
		
		if (count % 2 != 0) {
			return false;
		}
		
		return true;
	}
}
