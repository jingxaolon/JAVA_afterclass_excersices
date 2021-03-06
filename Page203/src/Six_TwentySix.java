
public class Six_TwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPalindromicPrime();
	}

	public static void printPalindromicPrime() {
		int count = 2;
		int number = 0;
		
		for (;number < 100;count++) {
			if (isPrime(count) && isPalindromic(count)) {
				number++;
				System.out.print(count + " ");
				
				if (number % 10 == 0) {
					System.out.print("\n");
				}
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
	
	public static boolean isPalindromic(int count) {
		String record = " ";
		int temp = count;
		
		while (temp > 0) {
			record += temp % 10;
			temp /= 10;
		}
		
		if (count == Integer.parseInt(record.trim())) {
			return true;
		}
		else {
			return false;
		}
	}	
}
