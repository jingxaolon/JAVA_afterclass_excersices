
public class Five_Eighteen_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Í¼°¸3
		for (int i = 1;i <= 6;i++) {
			
			int blank = 6 - i;
			int blankCount = 0;
			
			while (blankCount < blank) {
				System.out.printf(" " + " ");
				blankCount++;
			}
			
			
			for (int j = i;j >= 1;j--) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}

}
