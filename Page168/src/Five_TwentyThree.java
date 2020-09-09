
public class Five_TwentyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 50000;
		double sum1 = 0.0, sum2 = 0.0;
		
		//从右到左
		for (int i = n;i > 0;i--) {
			sum1 += 1.0 / i;
		}
		System.out.println("从右到左: " + sum1);
		
		//从左到右
		for (int i = 1;i <= 50000;i++) {
			sum2 += 1.0 / i;
		}
		System.out.println("从左到右: " + sum2);
		
		double smaller = sum1 > sum2?sum2:sum1;
		System.out.println("smaller result: " + smaller);
		//从左到右小，是因为舍入错误。
	}

}
