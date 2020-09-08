
public class Five_Nineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for (i = 0;i <= 7;i++) {
			
			for (int blank = 1;blank <= 7 - i; blank++) {
				System.out.print(" " + " ");
			}
			
			for (int j = 0;j<= i;j++) {
				System.out.print((int)Math.pow(2, j) + " ");
			}
			
			for (int k = i - 1;k >= 0;k--) {
				System.out.print((int)Math.pow(2, k) + " ");
			}
			
			System.out.print("\n");
		}
	}

}
