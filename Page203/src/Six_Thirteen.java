
public class Six_Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("i" + "\t\t" + "m(i)");
		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！");
		
		int i;
		for (i = 1;i <= 20;i++) {
			System.out.printf("%d\t\t%.4f\n", i, printSequence(i));
		}
		
	}

	public static double printSequence(int i) {
		double result = 0.0;
		
		int count = 0;
		for (count = 1;count <= i;count++) {
			result += count * 1.0 / (count + 1);
		}
		
		return result;
	}
}
