
public class Six_ThirtyEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("100 random character: ");
		int count = 1;
		for (;count <= 100;count++) {
			System.out.print(getRandomUpperCaseLetter());
			
			if (count % 10 == 0)
				System.out.print("\n");
		}
		
		System.out.println("\n100 random digital: ");
		for (count = 1;count <= 100;count++) {
			System.out.print(getRandomDigitCharacter());
			
			if (count % 10 == 0)
				System.out.print("\n");
		}
	}

	/** Generate a random character between ch1 and ch2 */
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	/** Generate a random lowercase letter */
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}

	/** Generate a random uppercase letter */
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	/** Generate a random digit character */
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

	/** Generate a random character */
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
}
