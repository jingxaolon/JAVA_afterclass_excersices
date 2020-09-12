import java.util.Scanner;

public class Five_ThirtyEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int integer1 = input.nextInt();
		
		int temp = integer1;
		String record = "";
		
		while (temp / 8 != 0) {
			record += temp % 8;
			temp /= 8;
		}
		record += temp % 8;
		
		//System.out.print(record);
	
		//×Ö·û´®·´×ª
		String result = "";
		for (int i = record.length() - 1;i >= 0;i--) {
			result += record.charAt(i);
		}
		System.out.print(result);
	}

}
