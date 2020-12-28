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
		 * ˼·��
		 * �ȴ��п�ʼ�жϣ���һ�в��������ż����1���������̶��жϸ�
		 * ���е�ÿһ��ֵ���ж��ĸ�ֵ�������к��ж�������ż����1��������ֵ
		 *  */
		int count = 0;
		int recordIndex = -1;
		for (i = 0;i < m1.length;i++) {
			for (j = 0;j < m1[i].length;j++) {
				if (m1[i][j] == 1) {
					count++;
				}
			}
			
			if (count % 2 != 0) {	//������ż����1����
				recordIndex = i;
				
				for (int k = 0;k < m1[recordIndex].length;k++) {
					if (test(m1, k)) {	//������ż����1������ѭ�����ж���һ��ֵ
						continue;
					}
					else {	//���в���ż����1
						//����ֵ��ת��ȷ���Ƿ�Ӱ����е��жϽ��
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
	
	public static boolean test(int[][] m1, int column) {	//�жϸ������Ƿ����ż����1���з���true���޷���false
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
