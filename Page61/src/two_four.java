import java.util.Scanner;

public class two_four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1������0.454ǧ��
		final double TRANS = 0.454;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number for pounds: ");
		double pounds = input.nextDouble();

		double kilograms = pounds * TRANS;
		System.out.println(pounds + " pounds is  " + kilograms + " kilograms");
	}

}
