
public class Six_TwentyEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("p" + "\t\t" + "2^p - 1");
		System.out.print("\n---------------------------\n");
		int i;
		for (i = 2;i <= 31;i++) {
			if (isPrime((int)(Math.pow(2, i) - 1))) {
				System.out.print(i + "\t\t" + (int)(Math.pow(2, i) - 1));
				System.out.print("\n");
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
