import java.util.Scanner;

public class two_thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly saving amount: ");
		double saving = input.nextDouble();
		
		double year_rate = 5;
		double month_rate = year_rate / 100 / 12.0;
		
		//1 month
		double first = 100 * (1 + month_rate);
		double second = (100 + first) * (1 + month_rate);
		double third = (100 + second) * (1 + month_rate);
		double forth = (100 + third) * (1 + month_rate);
		double fifth = (100 + forth) * (1 + month_rate);
		double sixth = (100 + fifth) * (1 + month_rate);
		
		System.out.println("After the sixth month, the account value is " + sixth);
	}

}
