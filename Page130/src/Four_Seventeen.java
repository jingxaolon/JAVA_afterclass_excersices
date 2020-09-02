import java.util.Scanner;

public class Four_Seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Enter a month: ");
		String s = input.next();
		char temp = s.charAt(0);
		
		if (s.length() != 3 || Character.isUpperCase(temp) != true) {
			System.out.println(s + " is not a correct month name");
			System.exit(1);
		}
		
		int isleap = 0;
		//≈–∂œ «∑Ò «»ÚƒÍ
		if ((year % 4  == 0 && year % 100 != 0) || (year % 400 == 0)) {
			isleap = 1;
		}
		
		int days = 0;
		
		switch(temp) {
		case 'J':
			if(s.equals("Jan")) {
				days = 31;
			}
			if(s.equals("Jun")) {
				days = 30;
			}
			if(s.equals("Jul")) {
				days = 31;
			}
		break;
		case 'F':
			if(isleap == 1) {
				days = 29;
			}
			else {
				days = 28;
			};
		case 'M':days = 31;break;
		case 'A':
			if(s.equals("Apr")) {
				days = 30;
			}
			if(s.equals("Aug")) {
				days = 31;
			}
		case 'S':days = 30;break;
		case 'O':days = 31;break;
		case 'N':days = 30;break;
		case 'D':days = 31;break;
		}
		
		System.out.println(s + " " + year + " has " + days + " days");
	}

}
