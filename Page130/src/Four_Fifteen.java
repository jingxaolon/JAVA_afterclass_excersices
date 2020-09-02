import java.util.Scanner;

public class Four_Fifteen {

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
		
		int num = 0;
		
		switch(Character.toLowerCase(temp)) {
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
		default:num = 999;
		}
		
		System.out.println("The corresponding number is " + num);
		
	}

}
