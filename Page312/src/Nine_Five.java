import java.util.*;

public class Nine_Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GregorianCalendar newCalendar1 = new GregorianCalendar();
		
		System.out.println("The date now is:");
		System.out.println(newCalendar1.get(GregorianCalendar.YEAR) + " " +
				(newCalendar1.get(GregorianCalendar.MONTH) + 1) + " " +
				newCalendar1.get(GregorianCalendar.DAY_OF_MONTH));
		
		newCalendar1.setTimeInMillis(1234567898765L);
		System.out.println("\nThe date after set is:");
		System.out.println(newCalendar1.get(GregorianCalendar.YEAR) + " " +
				(newCalendar1.get(GregorianCalendar.MONTH) + 1) + " " +
				newCalendar1.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
