
public class Eight_TwentyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] randomList = new int[6][6];
		
		int i, j;
		for (i = 0;i < randomList.length;i++) {
			for (j = 0;j < randomList[i].length;j++) {
				randomList[i][j] = (int) (Math.random() * 10) % 2;
				//randomList[i][j] = 1;
				System.out.print(randomList[i][j] + " ");
			}
			System.out.println();
		}
		
		//print result
		int[][] resultList = new int[2][randomList.length];		//维护两个一维数组，分别代表行和列
		int count = 0;
		
		for (i = 0;i < randomList.length;i++) {	//行
			count = 0;
			
			for (j = 0;j < randomList[i].length;j++) {
				if (randomList[i][j] == 1) {
					count++;
				}
			}
			
			if (count % 2 == 0) {
				resultList[0][i] = 1;
			}
		}
		
		for (i = 0;i < randomList[0].length;i++) {	//列
			count = 0;
			
			for (j = 0;j < randomList.length;j++) {
				if (randomList[j][i] == 1) {
					count++;
				}
			}
			
			if (count % 2 == 0) {
				resultList[1][i] = 1;
			}
		}
		
		for (i = 0;i < resultList.length;i++) {
			for (j = 0;j < resultList[i].length;j++) {
				if (resultList[i][j] != 1) {
					System.out.println("是否每行每列中有偶数个1? 否");
					System.exit(1);
				}
			}
		}
		
		System.out.println("是否每行每列中有偶数个1? 是");
	}

}
