import java.util.Scanner;

public class Six_TwentyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a millisecond value:");
		long millisecond = input.nextLong();
		
		System.out.println(convertMillis(millisecond));
	}

	public static String convertMillis(long millis) {
		String record = "";
		
		long hour = 0;
		long minute = 0;
		long second = 0;
		
		long tempSecond = millis / 1000;
		
		hour = tempSecond / (60 * 60);
		minute = (tempSecond % (60 * 60)) / 60;
		second = (tempSecond % (60 * 60)) % 60;
		
		record = (hour + ":" + minute + ":"+ second);
		
		return record;
	}
}
