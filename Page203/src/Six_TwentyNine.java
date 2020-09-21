
public class Six_TwentyNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for (i = 2;i <= 998;i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.print("(" + i + ", " + (i + 2) + ")\n");
			}
		}
	}
	
	public static boolean isPrime(int count) {
		int i;
		for (i = 2;i <= count / 2;i++) {
			if (count % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
