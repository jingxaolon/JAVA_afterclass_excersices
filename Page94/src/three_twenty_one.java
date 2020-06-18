import java.util.Scanner;

public class three_twenty_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = input.nextInt();
		
		System.out.print("Enter month: ");
		int month = input.nextInt();
		
		System.out.print("Enter the day of the month: 1-31: ");
		int day = input.nextInt();
		
		if (month == 1) {
			month = 13;
			year -= 1;
		}
		
		if (month == 2) {
			month = 14;
			year -= 1;
		}
		
		int q = day;
		int m = month;
		int k = year % 100;
		int j = year / 100;
		int result = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		//System.out.println(result);
		
		System.out.print("Day of the week is: ");
		switch (result) {
		case 0: System.out.print("Saturday");
		break;
		
		case 1: System.out.print("Sunday");
		break;
		
		case 2: System.out.print("Monday");
		break;
		
		case 3: System.out.print("Tuesday");
		break;
		
		case 4: System.out.print("Wednesday");
		break;
		
		case 5: System.out.print("Thursday");
		break;
		
		case 6: System.out.print("Friday");
		break;
		}

	}

}
