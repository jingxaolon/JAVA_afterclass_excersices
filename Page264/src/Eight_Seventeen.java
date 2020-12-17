import java.util.Scanner;

public class Eight_Seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

//		5 201
//		25 2 1 100.5 4 320.5
//		125 2 2 40 3 85
//		175 2 0 125 3 75
//		75 1 0 125
//		181 1 2 125
		//System.out.print("Enter the number of banks and the limit: ");
		int bankNum = input.nextInt();
		int limit = input.nextInt();
		int[] bankAssets = new int[bankNum];
		double[][] borrows = new double[bankNum][bankNum];
		
		int i, j;
		for (i = 0;i < bankNum;i++) {
			bankAssets[i] = input.nextInt();
			
			int tmpNum = input.nextInt();
			for (j = 0;j < tmpNum;j++) {
				borrows[i][input.nextInt()] = input.nextDouble();
			}
		}
		
//		//��֤�����Ƿ���ȷ�洢
//		System.out.println(java.util.Arrays.toString(bankAssets));
//		
//		for (i = 0;i < borrows.length;i++) {
//			for (j = 0;j < borrows[i].length;j++) {
//				System.out.print(borrows[i][j] + " ");
//			}
//			System.out.println();
//		}	//��ȷ�洢
		
		//calculate result
		//���ȼ�����֧ƽ�⣬����ȥ�Ŀ���ջأ���˭���ʲ��ǲ���limit��
		int[] unsafeBank = new int[bankNum];
		int unsafeBankIndex = 0;
		
		double sumAssets = 0;
		for (i = 0;i < bankNum;i++) {
			sumAssets += bankAssets[i];
			for (j = 0;j < bankNum;j++) {
				sumAssets += borrows[i][j];
			}
			
			if (sumAssets < 201) {	//������ʲ�С��limit����borrows�����еĽ���0
				unsafeBank[unsafeBankIndex++] = i;
				for (int k = 0;k < bankNum;k++) {
					borrows[k][i] = 0;
				}
			}
			
			sumAssets = 0;
		}
		
		//�ٴμ������ʲ����ʲ�����limit�ļ�Ϊunsafe���ѱ��Ϊunsafe���޳�
		int count = 0;
		int isUnsafe = 0;
		
		for (;count < bankNum - unsafeBankIndex;count++) {	//�鿴ʣ�������Ƿ�Ҳ���Ϊunsafe
			
			isUnsafe = 0;	//�ȼ��費��unsafe�����б���
			for (i = 0;i < bankNum;i++) {
				sumAssets = 0;
				
				for (j = 0;j < unsafeBankIndex;j++) {	//�ж��Ƿ��Ѿ�������unsafeBank������
					if (i == unsafeBank[j]) {	//������ڣ�������ѭ��
						isUnsafe = 1;
						break;
					}
				}
				
				//����ж�������ѭ��������������
				if (isUnsafe != 1) {	//isUnsafe != 1, ˵������unsafe�����б��У��ж��Ƿ���Ϊ�¼���unsafe����
					sumAssets += bankAssets[i];
					
					for (int k = 0;k < bankNum;k++) {
						sumAssets += borrows[i][k];
					}
					
					if (sumAssets < 201) {	//������ʲ�С��limit����borrows�����еĽ���0
						unsafeBank[unsafeBankIndex++] = i;
						for (int k = 0;k < bankNum;k++) {
							borrows[k][i] = 0;
						}
					}
				}
			}
		}
		
		//print result
		System.out.print("Unsafe banks are ");
		for (int tmp = 0;tmp < unsafeBankIndex;tmp++) {
			System.out.print(unsafeBank[tmp] + " ");
		}
		
	}

}
