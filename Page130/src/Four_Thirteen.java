import java.util.Scanner;

public class Four_Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		
		String s = input.nextLine();
		char temp = s.charAt(0);
		
		if (!Character.isLetter(temp)) {
			System.out.println(s + " is an invalid input");
			System.exit(1);
		}
		
		char x = s.toLowerCase().charAt(0);
		
		int isconsonant = 0;
		int isvowel = 0;
		
		switch(x) {
		case 'a':isvowel = 1;break;
		case 'e':isvowel = 1;break;
		case 'i':isvowel = 1;break;
		case 'o':isvowel = 1;break;
		case 'u':isvowel = 1;break;
		default:isconsonant = 1;
		}
		
		if (isconsonant == 1) {
			System.out.println(s + " is a consonant");
		}
		
		if (isvowel == 1) {
			System.out.println(s + " is a vowel");
		}
	}

}
