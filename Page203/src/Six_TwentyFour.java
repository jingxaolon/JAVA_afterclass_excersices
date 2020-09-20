
public class Six_TwentyFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getCurrentTime();
	}

	public static void getCurrentTime() {
		
		long totalMilliseconds = System.currentTimeMillis();

	    // Obtain the total seconds since midnight, Jan 1, 1970
	    long totalSeconds = totalMilliseconds / 1000;
	    
	    //Convert seconds to days
	    long daysPassedBy = totalSeconds / (24 * 60 * 60);
	    
	    System.out.println(getCurrentYear(daysPassedBy));

	    long secondLeft = totalSeconds % (24 * 60 * 60);

	    // Compute the current second in the minute in the hour
	    long currentSecond = secondLeft % 60;

	    // Obtain the total minutes
	    long totalMinutes = secondLeft / 60;

	    // Compute the current minute in the hour
	    long currentMinute = totalMinutes % 60;

	    // Obtain the total hours
	    long totalHours = totalMinutes / 60;

	    // Compute the current hour
	    long currentHour = totalHours % 24;

	    // Display results
	    System.out.println("Current time is " + currentHour + ":"
	      + currentMinute + ":" + currentSecond + " GMT");
	}
	
	public static int getCurrentYear(long daysPassedBy) {
		long count = daysPassedBy + 1;
		int startYear = 1970;
		int currentYear = startYear;

		while (count >= 366) {
			if (isLeapYear(startYear)) {
				count -= 366;
			}
			else {
				count -= 365;
			}
			currentYear++;
			startYear++;
		}
		
		//System.out.println(currentYear);
		getCurrentMonth(count, currentYear);
		return currentYear;
		//System.out.println(count);
	}
	
	public static boolean isLeapYear(int startYear) {
		if (startYear % 400 == 0 || (startYear % 4 == 0 && startYear % 100 != 0))
			return true;
		
		return false;
	}
	
	public static void getCurrentMonth(long count, int currentYear) {
		int monthCount = 1;
		int recordDays = 0;
		
		while (count >= 31) {
			switch (monthCount) {
			case 1:recordDays = 31;break;
			case 2:
				if (isLeapYear(currentYear)) {
					recordDays = 29;
				}
				else {
					recordDays = 28;
				};break;
			case 3:recordDays = 31;break;
			case 4:recordDays = 30;break;
			case 5:recordDays = 31;break;
			case 6:recordDays = 30;break;
			case 7:recordDays = 31;break;
			case 8:recordDays = 31;break;
			case 9:recordDays = 30;break;
			case 10:recordDays = 31;break;
			case 11:recordDays = 30;break;
			case 12:recordDays = 31;break;
			}
			count -= recordDays;
			monthCount++;
		}
		System.out.print(count + " ");
		//System.out.println(monthCount);
		switch (monthCount) {
		case 1: System.out.println("January");
		break;
		
		case 2: System.out.println("February");
		break;
		
		case 3: System.out.println("March");
		break;
		
		case 4: System.out.println("April");
		break;
		
		case 5: System.out.println("May");
		break;
		
		case 6: System.out.println("June");
		break;
		
		case 7: System.out.println("July");
		break;
		
		case 8: System.out.println("August");
		break;
		
		case 9: System.out.println("September");
		break;
		
		case 10: System.out.println("October");
		break;
		
		case 11: System.out.println("November");
		break;
		
		case 12: System.out.println("December");
		break;
		}
	}
}
