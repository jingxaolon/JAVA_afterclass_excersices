
public class Eight_Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] randomArray = new int [4][4];
		
		int i, j;
		for (i = 0;i < randomArray.length;i++) {
			for (j = 0;j < randomArray[i].length;j++) {
				randomArray[i][j] = (int) (Math.random() * 10) % 2;
			}
		}
		
		for (i = 0;i < randomArray.length;i++) {
			for (j = 0;j < randomArray[i].length;j++) {
				System.out.print(randomArray[i][j]);
			}
			System.out.println();
		}
		
		//calculate result		
		int count = 0, maxCount = 0, maxRow = -1, maxColumn = -1;
		
		//count row
		for (i = 0;i < randomArray.length;i++) {
			for (j = 0;j < randomArray[i].length;j++) {
				if (randomArray[i][j] == 1) {
					count++;
				}
			}
			
			if (count > maxCount) {
				maxCount = count;
				maxRow = i;
			}
			count = 0;
		}
		System.out.println("The largest row index: " + maxRow);
		
		//count column
		maxCount = 0;
		for (i = 0;i < randomArray[0].length;i++) {
			for (j = 0;j < randomArray.length;j++) {
				if (randomArray[j][i] == 1) {
					count++;
				}
			}
					
			if (count > maxCount) {
				maxCount = count;
				maxColumn = i;
			}
			count = 0;
		}
		System.out.println("The largest column index: " + maxColumn);
		
	}

}
