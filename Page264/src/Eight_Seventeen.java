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
		
//		//验证输入是否正确存储
//		System.out.println(java.util.Arrays.toString(bankAssets));
//		
//		for (i = 0;i < borrows.length;i++) {
//			for (j = 0;j < borrows[i].length;j++) {
//				System.out.print(borrows[i][j] + " ");
//			}
//			System.out.println();
//		}	//正确存储
		
		//calculate result
		//首先假设收支平衡，带出去的款都能收回，看谁的资产是不足limit的
		int[] unsafeBank = new int[bankNum];
		int unsafeBankIndex = 0;
		
		double sumAssets = 0;
		for (i = 0;i < bankNum;i++) {
			sumAssets += bankAssets[i];
			for (j = 0;j < bankNum;j++) {
				sumAssets += borrows[i][j];
			}
			
			if (sumAssets < 201) {	//如果总资产小于limit，将borrows数组中的借款方置0
				unsafeBank[unsafeBankIndex++] = i;
				for (int k = 0;k < bankNum;k++) {
					borrows[k][i] = 0;
				}
			}
			
			sumAssets = 0;
		}
		
		//再次计算总资产，资产不足limit的记为unsafe，已标记为unsafe的剔除
		int count = 0;
		int isUnsafe = 0;
		
		for (;count < bankNum - unsafeBankIndex;count++) {	//查看剩余银行是否也会变为unsafe
			
			isUnsafe = 0;	//先假设不在unsafe银行列表中
			for (i = 0;i < bankNum;i++) {
				sumAssets = 0;
				
				for (j = 0;j < unsafeBankIndex;j++) {	//判断是否已经存在于unsafeBank数组中
					if (i == unsafeBank[j]) {	//如果存在，则跳出循环
						isUnsafe = 1;
						break;
					}
				}
				
				//如何判断是跳出循环还是正常结束
				if (isUnsafe != 1) {	//isUnsafe != 1, 说明不在unsafe银行列表中，判断是否会成为新加入unsafe银行
					sumAssets += bankAssets[i];
					
					for (int k = 0;k < bankNum;k++) {
						sumAssets += borrows[i][k];
					}
					
					if (sumAssets < 201) {	//如果总资产小于limit，将borrows数组中的借款方置0
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
