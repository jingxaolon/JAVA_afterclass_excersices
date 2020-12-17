
public class Eight_TwentyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] randomList = new int[6][6];
		
		int i, j;
		for (i = 0;i < randomList.length;i++) {
			for (j = 0;j < randomList[i].length;j++) {
				randomList[i][j] = (int) (Math.random() * 10) % 2;
			}
		}
		
		for (i = 0;i < randomList.length;i++) {
			for (j = 0;j < randomList[i].length;j++) {
				System.out.print(randomList[i][j]);
			}
			System.out.println();
		}
		
		//print result
		int countForRow = 0;
		int countForColumn = 0;
		for (i = 0;i < randomList.length;i++) {
			for (j = 0;j < randomList[i].length;j++) {
				if (randomList[i][j] == 1) {
					countForRow++;
				}
			}
			if (countForRow % 2 != 0) {
				break;
			}
			
		}
		
		System.out.println();
	}

}
