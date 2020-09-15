
public class Six_Eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("��弁悳駆" + "\t\t" + "滑署");
		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！");
		
		int i;
		for (i = 10000;i <= 100000;i += 5000) {
			System.out.printf("%d\t\t%.1f\n", i, computeCommission(i));
		}
	}

	public static double computeCommission(double salesAmount) {
		double result = 0.0;
		
		if (salesAmount <= 5000) {
			//0.01-5000  8%
			result = salesAmount * 0.08;
		}
		else if (salesAmount <= 10000) {
			//5000.01-10000  10%
			result = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
		}
		else {
			//10000.01-  12%
			result = 5000 * 0.08 + 5000 * 0.1 + (salesAmount - 10000) * 0.12;
		}
		
		return result;
	}
}
