
public class Five_Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double MILE_TRANS = 1.609;

		System.out.println("Ӣ��" + "\t\t" + "ǧ��" + "\t" + "ǧ��" + "\t\t" + "Ӣ��");
		
		int countForKilo = 20;
		int countForMile = 1;
		
		while (countForMile <= 10) {
			System.out.printf("%d\t\t%.3f\t%d\t\t%.3f\n", countForMile, countForMile * MILE_TRANS, countForKilo, countForKilo / MILE_TRANS);
			countForMile++;
			countForKilo += 5;
		}
	}

}
