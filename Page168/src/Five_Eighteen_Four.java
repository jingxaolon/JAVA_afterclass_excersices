
public class Five_Eighteen_Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Í¼°¸2
		for (int i = 6;i >= 1;i--) {
			
			int blank = 6 - i;
			int blankCount = 0;
			
			while (blankCount < blank) {
				System.out.printf(" " + " ");
				blankCount++;
			}
			
			for (int j = 1;j <= i;j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}

}
