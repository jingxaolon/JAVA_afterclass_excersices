
public class Six_Sixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for (i = 2000;i <= 2020;i++) {
			System.out.println(i + " has " + numberOfDaysInAYear(i) + " days");
		}
	}

	public static int numberOfDaysInAYear(int year) {
		int result = 0;
		
		if (year % 400 == 0 || (year % 4 == 0 && year % 10 != 0)) {
			result = 366;
		}
		else {
			result = 365;
		}
		
		return result;
	}
}
