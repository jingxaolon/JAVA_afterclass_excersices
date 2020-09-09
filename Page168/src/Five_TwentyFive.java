
public class Five_TwentyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pi = 0.0;
		double sum = 0.0;
		
		int count = 10000;
		for (;count <= 100000;count += 10000) {
			for (int i = 1;i <= 2 * count -1;i += 2) {
				sum += Math.pow(-1, i + 1) * 1.0 / i;
			}
			pi = 4 * sum;
			System.out.printf("count = %d, result = %.10f\n", count, pi);
			sum = 0.0;
		}
		
		

	}

}
