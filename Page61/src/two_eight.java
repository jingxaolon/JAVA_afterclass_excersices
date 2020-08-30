import java.util.Scanner;

public class two_eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the time zone offset to GMT: ");
		
		long offset = input.nextLong();
		
	    long totalMilliseconds = System.currentTimeMillis();

	    // Obtain the total seconds since midnight, Jan 1, 1970
	    long totalSeconds = totalMilliseconds / 1000;

	    // Compute the current second in the minute in the hour
	    long currentSecond = totalSeconds % 60;

	    // Obtain the total minutes
	    long totalMinutes = totalSeconds / 60;

	    // Compute the current minute in the hour
	    long currentMinute = totalMinutes % 60;

	    // Obtain the total hours
	    long totalHours = totalMinutes / 60;

	    // Compute the current hour
	    long currentHour = totalHours % 24;

	    //只是显示特定时区的时间，无法显示具体的日期
	    //currentHour + offset小于0的话，显示的结果不太合适。
	    long results = currentHour + offset;
	    
	    // Display results
	    System.out.println("The current time is " + results + ":"
	      + currentMinute + ":" + currentSecond + " GMT");
	}

}
