
public class Six_Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		
		int i;
		for (i = 2;i <= 10000;i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		
		System.out.print("The number of prime numbers in 10000: " + count);
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
