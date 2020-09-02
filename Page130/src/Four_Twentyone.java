import java.util.Scanner;

public class Four_Twentyone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a SSN: ");
		String s = input.nextLine();
		
		//DDD-DD-DDDD
		int first = s.indexOf("-");
		int last = s.lastIndexOf("-");
		
		String s1 = s.substring(0, first);
		String s2 = s.substring(first + 1, last);
		String s3 = s.substring(last + 1);
		
		if (s1.length() != 3 || s2.length() != 2 || s3.length() != 4) {
			System.out.println(s + " is an invalid social security number");
			System.exit(1);
		}
		else {
			System.out.println(s + " is a valid social security number");
		}
	}

}
