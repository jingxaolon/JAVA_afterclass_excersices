import java.util.Scanner;

public class Six_ThirtySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number and width: ");
		int number = input.nextInt();
		int width = input.nextInt();
		
		System.out.print(format(number, width));
	}

	public static String format(int number, int width) {
		int getnumber = 0;
		int temp = number;
		String result = "";
		
		while (temp > 0) {
			getnumber++;
			temp /= 10;
		}
		
		if (getnumber <= width) {
			int numberOfZeros = width - getnumber;
			
			while (numberOfZeros > 0) {
				result += "0";
				numberOfZeros--;
			}
			result += number;
		}
		else {
			result += number;
		}
		
		return result;
	}
}
