import java.util.Scanner;

public class Six_Eighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a password: ");
		String passwd = input.next();
		
		if (lengthMatch(passwd) && characterAndDigitalMatch(passwd) && twoDigitalMatch(passwd)) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
	}
	
	public static boolean lengthMatch(String n) {
		if (n.length() < 8) {
			return false;
		}
		
		return true;
	}

	public static boolean characterAndDigitalMatch(String n) {
		int length = n.length();
		
		int i;
		for (i = 0;i < length;i++) {
			if (Character.isLetter(n.charAt(i)) || Character.isDigit(n.charAt(i))) {
				continue;
			}
			else {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean twoDigitalMatch(String n) {
		int count = 0;
		int length = n.length();
		
		int i;
		for (i = 0;i < length;i++) {
			if (Character.isDigit(n.charAt(i))) {
				count++;
			}
		}
		
		return count > 1?true:false;
	}
}
