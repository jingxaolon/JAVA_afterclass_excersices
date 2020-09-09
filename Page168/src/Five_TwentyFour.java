
public class Five_TwentyFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum = 0.0;
		
		for (int i = 1, j = 3;i <= 97;i += 2, j += 2) {
			sum += (i * 1.0 / j);
		}
		System.out.println("result: " + sum);
	}

}
