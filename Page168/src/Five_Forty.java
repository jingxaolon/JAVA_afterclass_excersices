
public class Five_Forty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//正面
		int coinObverse = 0;
		//反面
		int coinReverse = 0;
		
		int temp = -1;
		
		int i = 1;
		while (i <= 1000000) {
			temp = (int)(Math.random() * 10 % 2);
			
			if (temp == 0)
				coinObverse++;
			else
				coinReverse++;
			
			i++;
		}
		
		System.out.println("coinObverse: " + coinObverse);
		System.out.println("coinReverse: " + coinReverse);
	}

}
