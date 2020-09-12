
public class Five_ThirtyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum = 0.0;
		
		int i;
		for (i = 1;i <= 624;i++) {
			sum += 1 / (Math.sqrt(i) + Math.sqrt(i + 1));
		}
		
		System.out.printf("%.20f\n", sum);
	}

}
