
public class Seven_Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NUMBEROFPRIME = 50;
		
		int startNumber = 2;
		
		/* Determine whether it is a prime number */
		int count = 0;
		for (;count < NUMBEROFPRIME;) {
			if (isPrime(startNumber)) {
				System.out.print(startNumber + "\t");
				count++;
				if (count % 10 == 0)
					System.out.print("\n");
			}
			startNumber++;
		}
		
	}

	/** Check whether number is prime */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // number is not a prime
			}
		}

		return true; // number is prime
	}
}
