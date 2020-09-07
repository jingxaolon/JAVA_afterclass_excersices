
public class Five_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double KILO_TRANS = 2.2;

		System.out.println("Ç§¿Ë" + "\t\t" + "°õ");
		
		int count = 1;
		while (count <= 199) {
			System.out.printf("%d\t\t%.1f\n", count, count * KILO_TRANS);
			//System.out.println(count + "\t\t" + count * KILO_TRANS);
			count += 2;
		}
	}

}
