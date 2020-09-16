import java.util.Scanner;

public class Six_TwentyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string and a character: ");
		
		String stringValue = input.next();
		String stringValue2 = input.next();
		char charValue = stringValue2.charAt(0);
		
		System.out.print("The number of times the character appears in the string: " + count(stringValue, charValue));
	}

	public static int count(String str, char a) {
		int length = str.length();
		int count = 0;
		
		int i;
		for (i = 0;i < length;i++) {
			if (str.charAt(i) == a) {
				count++;
			}
		}
		
		return count;
	}
}
