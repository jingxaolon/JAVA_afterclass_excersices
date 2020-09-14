
public class Six_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		
		int i;
		for (i = 1;i <= 100;i++) {
			System.out.printf("%7d", getPentagonalNumber(i));
			count++;
			
			if (count % 10 == 0)
				System.out.print("\n");
		}
		
		
	}
	
	public static int getPentagonalNumber(int n) {
		int result;
		
		result = n * (3 * n - 1) / 2;
		
		return result;
	}

}
