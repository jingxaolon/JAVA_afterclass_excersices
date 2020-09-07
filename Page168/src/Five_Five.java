
public class Five_Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double KILO_TRANS = 2.2;

		System.out.println("Ç§¿Ë" + "\t\t" + "°õ" + "\t" + "°õ" + "\t\t" + "Ç§¿Ë");
		
		int countForKilo = 1;
		int countForPound = 20;
		
		while (countForKilo <= 199) {
			System.out.printf("%d\t\t%.1f\t%d\t\t%.2f\n", countForKilo, countForKilo * KILO_TRANS, countForPound, countForPound / KILO_TRANS);
			countForKilo += 2;
			countForPound += 5;
		}
	}

}
