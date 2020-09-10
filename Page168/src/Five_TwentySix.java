
public class Five_TwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double e = 1.0;
		double item = 1.0;
		
		int count = 10000;
		for (;count <= 100000;count += 10000) {
			for (int i = 1;i <= count;i++) {
				//ÉáÈë´íÎóµÄµäÐÍ
				item /= i;
				e += item;
			}
			System.out.printf("count = %d, result = %.20f\n", count, e);
			//System.out.printf("%.10f\n", item);
			e = 1.0;
			item = 1.0;
		}
	}

}
