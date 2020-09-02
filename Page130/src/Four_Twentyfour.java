import java.util.Scanner;

public class Four_Twentyfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first city: ");
		String s1 = input.nextLine();
		
		System.out.print("Enter the second city: ");
		String s2 = input.nextLine();
		
		System.out.print("Enter the third city: ");
		String s3 = input.nextLine();
		
		String r1 = "";
		String r2 = "";
		String r3 = "";
		
		if (s1.compareTo(s2) < 0) {
			if (s2.compareTo(s3) < 0) {
				r1 = s1;
				r2 = s2;
				r3 = s3;
			}
			else {
				if (s1.compareTo(s3) < 0) {
					r1 = s1;
					r2 = s3;
					r3 = s2;
				}
				else {
					r1 = s3;
					r2 = s1;
					r3 = s2;
				}
				
			}
		}
		else {
			if (s1.compareTo(s3) < 0) {
				r1 = s2;
				r2 = s1;
				r3 = s3;
			}
			else {
				if (s2.compareTo(s3) < 0) {
					r1 = s2;
					r2 = s3;
					r3 = s1;
				}
				else {
					r1 = s3;
					r2 = s2;
					r3 = s1;
				}
				
			}
		}
		
		System.out.println("The three cities in alphabetical order are: " + r1 + " " + r2 + " " + r3);
	}

}
