
public class Five_Fifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		for (int num = 33;num <= 126;num++) {
			System.out.print((char)num + " ");
			count++;
			
			if (count % 10 == 0) {
				System.out.print("\n");
			}
		}
	}

}
