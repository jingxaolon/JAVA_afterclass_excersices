
public class Five_Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double MILE_TRANS = 1.609;

		System.out.println("Ó¢Àï" + "\t\t" + "Ç§Ã×");
		
		int count = 1;
		while (count <= 10) {
			System.out.printf("%d\t\t%.3f\n", count, count * MILE_TRANS);
			count++;
		}
	}

}
