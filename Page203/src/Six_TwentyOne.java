import java.util.Scanner;

public class Six_TwentyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string1 = input.next();
		
		int length = string1.length();
		String result = "";
		
		int i;
		for (i = 0;i < length;i++) {
			if (getNumber(string1.charAt(i)) == 1) {
				result += string1.charAt(i);
			}
			else {
				result += getNumber(string1.charAt(i));
			}
			
		}
		
		System.out.print(result);
	}

	public static int getNumber(char uppercaseLetter) {
		char temp = '0';
		int num = -1;
		
		if (Character.isLetter(uppercaseLetter)) {
			temp = Character.toLowerCase(uppercaseLetter);
		}
		else {
			return 1;
		}

		switch(temp) {
		case 'a':
		case 'b':
		case 'c':num = 2;break;
		
		case 'd':
		case 'e':
		case 'f':num = 3;break;
		
		case 'g':
		case 'h':
		case 'i':num = 4;break;
		
		case 'j':
		case 'k':
		case 'l':num = 5;break;
		
		case 'm':
		case 'n':
		case 'o':num = 6;break;
		
		case 'p':
		case 'q':
		case 'r':
		case 's':num = 7;break;
		
		case 't':
		case 'u':
		case 'v':num = 8;break;
		
		case 'w':
		case 'x':
		case 'y':
		case 'z':num = 9;break;
		}
		
		return num;
	}
}
