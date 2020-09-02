import java.util.Scanner;

public class Four_Eighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two characters: ");
		String s = input.nextLine();
		char m = s.charAt(0);
		char g = s.charAt(1);
		
		if (m != 'M' || m != 'C' || m != 'I' || g != '1' || g != '2' || g != '3' || g != '4') {
			System.out.println("Invalid input");
			System.exit(1);
		}
		
		String major = "";
		String grade = "";
		
		switch(m) {
		case 'M':major = "Mathematics";break;
		case 'C':major = "Computer Science";break;
		case 'I':major = "Information Technology";break;
		}
		
		switch(g) {
		case '1':grade = "Freshman";break;
		case '2':grade = "Sophomore ";break;
		case '3':grade = "Junior";break;
		case '4':grade = "Senior";break;
		}
		
		System.out.println(major + " " + grade);
	}

}
