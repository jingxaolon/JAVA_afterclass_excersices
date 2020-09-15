
public class Six_Fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("i" + "\t\t" + "m(i)");
		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！");
		
		int i;
		for (i = 1;i < 1000;i += 100) {
			System.out.printf("%d\t\t%.4f\n", i, printPi(i));
		}
		
	}

	public static double printPi(int i) {
		double result = 0.0;
		
		int count = 0;
		for (count = 1;count <= i;count++) {
			result += Math.pow(-1, count + 1) / (2 * count - 1);
		}
		
		return 4 * result;
	}
}
