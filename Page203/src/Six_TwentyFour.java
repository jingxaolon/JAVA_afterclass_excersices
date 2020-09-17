
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
	    
	    getCurrentYear(daysPassedBy);

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
	
	public static void getCurrentYear(long daysPassedBy) {
		long count = daysPassedBy;
		int startYear = 1970;
		int currentYear = startYear;

		while (count > 366) {
			if (isLeapYear(startYear)) {
				count -= 366;
			}
			else {
				count -= 365;
			}
			currentYear++;
			startYear++;
		}
		
		System.out.println(currentYear);
		//System.out.println(count);
		//getCurrentMonth(count);
	}
	
	public static boolean isLeapYear(int startYear) {
		if (startYear % 400 == 0 || (startYear % 4 == 0 && startYear % 100 != 0))
			return true;
		
		return false;
	}
	
	public static void getCurrentMonth(long count) {
		
	}
	
	
	
	
	
	public static void showCurrentDate() {
		
	}
}
