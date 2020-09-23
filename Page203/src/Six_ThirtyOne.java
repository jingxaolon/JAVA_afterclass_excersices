
public class Six_ThirtyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.print(getSize(444));
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		return true;
	}
	
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		return 0;
	}
	
	/** Return this number if it is a single digit, otherwise,
	 * return the sum of the two digits */
	public static int getDigit(int number) {
		return 0;
	}
	
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		return 0;
	}
	
	/** Return true if the number d is a prefix for number */
	public static boolean prefixMatched(long prefix, int d) {
		return true;
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d) {
		int count = 0;
		
		while (d / 10 != 0) {
			d /= 10;
			count++;
		}
		count++;
		
		return count;
	}
	
	/** Return the first k number of digits from number. If the
	 * number of digits in number is less than k, return number.  */
	public static long getPrefix(long number, int k) {
		return 0;
	}
}
