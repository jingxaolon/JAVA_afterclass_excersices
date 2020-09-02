import java.util.Scanner;

public class Four_Fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		
		String s = input.nextLine();
		char temp = s.charAt(0);
		
		if (!Character.isLetter(temp)) {
			System.out.println(s + " is an invalid grade");
			System.exit(1);
		}
		
		int num = 0;
		
		switch(temp) {
		case 'A':num = 4;break;
		case 'B':num = 3;break;
		case 'C':num = 2;break;
		case 'D':num = 1;break;
		case 'F':num = 0;break;
		default:num = 999;
		}
		
		if (num == 999) {
			System.out.println(temp + " is an invalid grade");
			System.exit(1);
		}
		else {
			System.out.println("The numeric value for grade " + temp + " is " + num);
		}
	}

}
