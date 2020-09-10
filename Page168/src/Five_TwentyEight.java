import java.util.Scanner;

public class Five_TwentyEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the year and " + 
				"the number which indicates the first day of the year is the day of the week: ");
		
		int year = input.nextInt();
		int day = input.nextInt();
		
		String dayInAWeek = "";
		switch (day) {
		case 1:dayInAWeek = "Monday";break;
		case 2:dayInAWeek = "Tuesday";break;
		case 3:dayInAWeek = "Wednesday";break;
		case 4:dayInAWeek = "Thursday";break;
		case 5:dayInAWeek = "Friday";break;
		case 6:dayInAWeek = "Saturday";break;
		case 7:dayInAWeek = "Sunday";break;
		}
		
		String month = "";
		int daysInAMonth = 0;
		for (int i = 1;i <= 12;i++) {
			switch (i) {
			case 1:
				month = "January";
				daysInAMonth += 31;
			break;
			
			case 2:
				month = "February";
				switch ((daysInAMonth + 2) % 7) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					daysInAMonth += 29;
				}
				else {
					daysInAMonth += 28;
				}
			break;
			
			case 3:
				month = "March";
				switch ((daysInAMonth + 2) % 7) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 31;
			break;
			
			case 4:
				month = "April";
				switch ((daysInAMonth + 2) % 7) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 30;
			break;
			
			case 5:
				month = "May";
				switch ((daysInAMonth + 2) % 7) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 31;
			break;
			
			case 6:
				month = "June";
				switch ((daysInAMonth + 2) % 7) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 30;
			break;
			
			case 7:
				month = "July";
				switch ((daysInAMonth + 2) % 7) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 31;
			break;
			
			case 8:
				month = "August";
				switch ((daysInAMonth + 2) % 7) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 31;
			break;
			
			case 9:
				month = "September";
				switch ((daysInAMonth + 2) % 7) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 30;
			break;
			
			case 10:
				month = "October";
				switch ((daysInAMonth + 2) % 7) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 31;
			break;
			
			case 11:
				month = "November";
				switch ((daysInAMonth + 2) % 7) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 30;
			break;
			
			case 12:
				month = "December";
				switch ((daysInAMonth + 2) % 7) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
			break;
			}
			
			System.out.println(month + " 1, " + year + " is " + dayInAWeek);
		}
				
		//System.out.println("January 1, " + year + " is " + dayInAWeek);
		
	}

}
