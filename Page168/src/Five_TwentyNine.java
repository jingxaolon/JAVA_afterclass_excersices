import java.util.Scanner;

public class Five_TwentyNine {

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
		int daysRecord = 0;
		int recordDayInAWeek = 0;
		for (int i = 1;i <= 12;i++) {
			switch (i) {
			case 1:
				month = "January";
				recordDayInAWeek = day;
				daysInAMonth += 31;
				daysRecord = 31;
			break;
			
			case 2:
				month = "February";
				recordDayInAWeek = ((daysInAMonth % 7) + day);
				if (recordDayInAWeek == 7) {
					recordDayInAWeek = 7;
				}
				if (recordDayInAWeek > 7) {
					recordDayInAWeek = recordDayInAWeek % 7;
				}
				
				switch (recordDayInAWeek) {
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
					daysRecord = 29;
				}
				else {
					daysInAMonth += 28;
					daysRecord = 28;
				}
			break;
			
			case 3:
				month = "March";
				recordDayInAWeek = ((daysInAMonth % 7) + day);
				if (recordDayInAWeek == 7) {
					recordDayInAWeek = 7;
				}
				if (recordDayInAWeek > 7) {
					recordDayInAWeek = recordDayInAWeek % 7;
				}
				
				switch (recordDayInAWeek) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 31;
				daysRecord = 31;
			break;
			
			case 4:
				month = "April";
				recordDayInAWeek = ((daysInAMonth % 7) + day);
				if (recordDayInAWeek == 7) {
					recordDayInAWeek = 7;
				}
				if (recordDayInAWeek > 7) {
					recordDayInAWeek = recordDayInAWeek % 7;
				}
				
				switch (recordDayInAWeek) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 30;
				daysRecord = 30;
			break;
			
			case 5:
				month = "May";
				recordDayInAWeek = ((daysInAMonth % 7) + day);
				if (recordDayInAWeek == 7) {
					recordDayInAWeek = 7;
				}
				if (recordDayInAWeek > 7) {
					recordDayInAWeek = recordDayInAWeek % 7;
				}
				
				switch (recordDayInAWeek) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 31;
				daysRecord = 31;
			break;
			
			case 6:
				month = "June";
				recordDayInAWeek = ((daysInAMonth % 7) + day);
				if (recordDayInAWeek == 7) {
					recordDayInAWeek = 7;
				}
				if (recordDayInAWeek > 7) {
					recordDayInAWeek = recordDayInAWeek % 7;
				}
				
				switch (recordDayInAWeek) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 30;
				daysRecord = 30;
			break;
			
			case 7:
				month = "July";
				recordDayInAWeek = ((daysInAMonth % 7) + day);
				if (recordDayInAWeek == 7) {
					recordDayInAWeek = 7;
				}
				if (recordDayInAWeek > 7) {
					recordDayInAWeek = recordDayInAWeek % 7;
				}
				
				switch (recordDayInAWeek) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 31;
				daysRecord = 31;
			break;
			
			case 8:
				month = "August";
				recordDayInAWeek = ((daysInAMonth % 7) + day);
				if (recordDayInAWeek == 7) {
					recordDayInAWeek = 7;
				}
				if (recordDayInAWeek > 7) {
					recordDayInAWeek = recordDayInAWeek % 7;
				}
				
				switch (recordDayInAWeek) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 31;
				daysRecord = 31;
			break;
			
			case 9:
				month = "September";
				recordDayInAWeek = ((daysInAMonth % 7) + day);
				if (recordDayInAWeek == 7) {
					recordDayInAWeek = 7;
				}
				if (recordDayInAWeek > 7) {
					recordDayInAWeek = recordDayInAWeek % 7;
				}
				
				switch (recordDayInAWeek) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 30;
				daysRecord = 30;
			break;
			
			case 10:
				month = "October";
				recordDayInAWeek = ((daysInAMonth % 7) + day);
				if (recordDayInAWeek == 7) {
					recordDayInAWeek = 7;
				}
				if (recordDayInAWeek > 7) {
					recordDayInAWeek = recordDayInAWeek % 7;
				}
				
				switch (recordDayInAWeek) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 31;
				daysRecord = 31;
			break;
			
			case 11:
				month = "November";
				recordDayInAWeek = ((daysInAMonth % 7) + day);
				if (recordDayInAWeek == 7) {
					recordDayInAWeek = 7;
				}
				if (recordDayInAWeek > 7) {
					recordDayInAWeek = recordDayInAWeek % 7;
				}
				
				switch (recordDayInAWeek) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysInAMonth += 30;
				daysRecord = 30;
			break;
			
			case 12:
				month = "December";
				recordDayInAWeek = ((daysInAMonth % 7) + day);
				if (recordDayInAWeek == 7) {
					recordDayInAWeek = 7;
				}
				if (recordDayInAWeek > 7) {
					recordDayInAWeek = recordDayInAWeek % 7;
				}
				
				switch (recordDayInAWeek) {
				case 1:dayInAWeek = "Monday";break;
				case 2:dayInAWeek = "Tuesday";break;
				case 3:dayInAWeek = "Wednesday";break;
				case 4:dayInAWeek = "Thursday";break;
				case 5:dayInAWeek = "Friday";break;
				case 6:dayInAWeek = "Saturday";break;
				case 7:dayInAWeek = "Sunday";break;
				}
				daysRecord = 31;
			break;
			}
			
			//嬉咫箕遊
			System.out.println("\t\t" + "    " + month + " " + year);
			System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
			System.out.println(" " + "Sun" + "\t" + "Mon" + "\t" + "Tue" + "\t" + "Wed" + "\t" + "Thu"
					+ "\t" + "Fri" + "\t" + "Sat");
			
			//嬉咫晩豚
			switch (recordDayInAWeek) {
			case 1:System.out.print(" " + "   " + "\t");break;
			case 2:System.out.print(" " + "   " + "\t" + "   " + "\t");break;
			case 3:System.out.print(" " + "   " + "\t" + "   " + "\t" + "   " + "\t");break;
			case 4:System.out.print(" " + "   " + "\t" + "   " + "\t" + "   " + "\t" + "   " + "\t");break;
			case 5:System.out.print(" " + "   " + "\t" + "   " + "\t" + "   " + "\t" + "   " + "\t" + "   " + "\t");break;
			case 6:System.out.print(" " + "   " + "\t" + "   " + "\t" + "   " + "\t" + "   " + "\t" + "   " + "\t" + "   " + "\t");break;
			}
			
			int countPrint = daysRecord;
			for (int k = 1;k <= countPrint;k++) {
				System.out.print(k + "\t");
				if ((k + recordDayInAWeek) % 7 == 0) {
					System.out.print("\n");
				}
			}
			System.out.print("\n");
			//System.out.println(month + " 1, " + year + " is " + dayInAWeek);
		}
		
	}

}
