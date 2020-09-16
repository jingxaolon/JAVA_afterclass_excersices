import java.util.Scanner;

public class Six_Twenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string1 = input.next();
		
		System.out.println("The number of the letters in this string: " + countLetters(string1));
	}

	public static int countLetters(String n) {
		int count = 0;
		int length = n.length();
		
		int i;
		for (i = 0;i < length;i++) {
			if (Character.isLetter(n.charAt(i))) {
				count++;
			}
		}
		
		return count;
	}
}
