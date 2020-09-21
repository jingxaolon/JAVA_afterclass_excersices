
public class Six_TwentySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printEmirp();
	}

	public static void printEmirp() {
		int count = 2;
		int number = 0;
		
		for (;number < 100;count++) {
			if (isPrime(count) && isNotPalindromic(count)) {
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
	
	public static boolean isNotPalindromic(int count) {
		String record = " ";
		int temp = count;
		
		while (temp > 0) {
			record += temp % 10;
			temp /= 10;
		}
		
		if (isPrime(Integer.parseInt(record.trim())) && count != Integer.parseInt(record.trim())) {
			return true;
		}
		else {
			return false;
		}
	}
}
