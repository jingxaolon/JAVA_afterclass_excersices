
public class Six_Thirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstValue = getDiceValue();
		int secondValue = getDiceValue();
		
		int sum1 = firstValue + secondValue;
		int sum2 = 0;
		
		if (sum1 == 2 || sum1 == 3 || sum1 == 12) {
			System.out.println("You rolled " + firstValue + " + " + secondValue + " = " + sum1);
			System.out.println("You lose");
		}
		else if (sum1 == 7 || sum1 == 11) {
			System.out.println("You rolled " + firstValue + " + " + secondValue + " = " + sum1);
			System.out.println("You win");
		}
		else {
			System.out.println("You rolled " + firstValue + " + " + secondValue + " = " + sum1);
			System.out.println("point is " + sum1);
			
			do {
				firstValue = getDiceValue();
				secondValue = getDiceValue();
				sum2 = firstValue + secondValue;
			}while(sum2 != 7 || sum2 != sum1);
			
			if (sum2 == 7) {
				System.out.println("You rolled " + firstValue + " + " + secondValue + " = " + sum2);
				System.out.println("You lose");
			}
			
			if (sum2 == sum1) {
				System.out.println("You rolled " + firstValue + " + " + secondValue + " = " + sum2);
				System.out.println("You win");
			}
		}
	}

	public static int getDiceValue() {
		return (int)(Math.random() * 6 + 1);
	}
}
