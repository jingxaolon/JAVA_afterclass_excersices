import java.util.Scanner;

public class three_thirty {

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
	      
	    long results = currentHour + offset;
	    
	    if (results < 0) {
	    	//���������ʱΪ����ʱ��Ӧ����24:00�����ڼ�һ��
	    	long temp1 = results;
	    	temp1 += 24;
	    	
	    	if ((temp1 / 12) == 0) {
			    System.out.println("The current time is " + (temp1 % 12) + ":"
					      + currentMinute + ":" + currentSecond + " AM yesterday");
	    	}
	    	else {
			    System.out.println("The current time is " + (temp1 % 12) + ":"
					      + currentMinute + ":" + currentSecond + " PM yesterday");
	    	}
	    }

	    if (results > 24) {
	    	//���������ʱ���ڻ����24:00ʱ��Ӧ��ȥ24:00�����ڼ�һ��
	    	long temp2 = results;
	    	temp2 -= 24;
	    	
	    	if ((temp2 / 12) == 0) {
			    System.out.println("The current time is " + (temp2 % 12) + ":"
					      + currentMinute + ":" + currentSecond + " AM tomorrow");
	    	}
	    	else {
			    System.out.println("The current time is " + (temp2 % 12) + ":"
					      + currentMinute + ":" + currentSecond + " PM tomorrow");
	    	}
	    }
	    
	    if (results > 0 && results < 24) {
	    	if ((results / 12) == 0) {
			    System.out.println("The current time is " + (results % 12) + ":"
					      + currentMinute + ":" + currentSecond + " AM");
	    	}
	    	else {
			    System.out.println("The current time is " + (results % 12) + ":"
					      + currentMinute + ":" + currentSecond + " PM");
	    	}
	    }
	}
}
