
public class Five_TwentySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		
		int year = 101;
		for (;year <= 2100;year++) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.print(year + " ");
				count++;
				if (count % 10 == 0)
					System.out.println();
			}
		}
		System.out.printf("\n\n");
		System.out.println("The number of leap year is: " + count);
	}

}
