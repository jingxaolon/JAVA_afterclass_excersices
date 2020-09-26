import java.util.Scanner;

public class Six_ThirtyFour {
  /** Main method */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter year
    System.out.print("Enter full year (e.g., 2001): ");
    int year = input.nextInt();

    // Prompt the user to enter month
//    System.out.print("Enter month in number between 1 and 12: ");
//    int month = input.nextInt();

    // Print calendar for the month of the year
    printEveryMonthDay(year);
  }

  /** Print the calendar for a month in a year */
  public static void printEveryMonthDay(int year) {
	  int monthCount;
	  for (monthCount = 1;monthCount <= 12;monthCount++) {
		  printDay(year, monthCount);
	  }
  }
  
  public static void printDay(int year, int monthCount) {
	  final int START_DAY_FOR_JAN_1_1800 = 3;
	  
	  int totalNumberOfDays = getTotalNumberOfDays(year, monthCount);
	  
	  String monthName = "";
	    switch (monthCount) {
	      case 1: monthName = "January"; break;
	      case 2: monthName = "February"; break;
	      case 3: monthName = "March"; break;
	      case 4: monthName = "April"; break;
	      case 5: monthName = "May"; break;
	      case 6: monthName = "June"; break;
	      case 7: monthName = "July"; break;
	      case 8: monthName = "August"; break;
	      case 9: monthName = "September"; break;
	      case 10: monthName = "October"; break;
	      case 11: monthName = "November"; break;
	      case 12: monthName = "December";
	    }
	  
	  String dayName = "";
	    switch ((totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7) {
	      case 0: dayName = "Sunday"; break;
	      case 1: dayName = "Monday"; break;
	      case 2: dayName = "Tuesday"; break;
	      case 3: dayName = "Wednesday"; break;
	      case 4: dayName = "Thursday"; break;
	      case 5: dayName = "Friday"; break;
	      case 6: dayName = "Saturday"; break;
	    }
	    
	    System.out.println(monthName +  " " + dayName);
  }
  
  public static int getTotalNumberOfDays(int year, int monthCount) {
	  int totalNumberOfDays = 0;
	  int countYearStart = 1800;
	  
	  while (countYearStart < year) {
		  if (isLeapYear(countYearStart)) {
			  totalNumberOfDays += 366;
		  }
		  else {
			  totalNumberOfDays += 365;
		  }
		  
		  countYearStart++;
	  }
		
	  while (monthCount - 1 > 0) {
		  int month = monthCount - 1;
		  if (month == 1 || month == 3 || month == 5 || month == 7 ||
			      month == 8 || month == 10 || month == 12)
			  	totalNumberOfDays += 31;

			    if (month == 4 || month == 6 || month == 9 || month == 11)
			    	totalNumberOfDays += 30;

			    if (month == 2)  totalNumberOfDays += isLeapYear(countYearStart) ? 29 : 28;
			   
			    monthCount--;
	  }
		  
	  return totalNumberOfDays;
  }
  
  public static boolean isLeapYear(int year) {
	return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }
}
