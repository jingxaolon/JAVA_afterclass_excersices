import java.util.*;

public class Five_ThirtySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int integer1 = input.nextInt();
		
		int temp = integer1;
		String record = "";
		
		while (temp / 2 != 0) {
			record += temp % 2;
			temp /= 2;
		}
		record += temp % 2;
		
		//System.out.print(record);
	
		//×Ö·û´®·´×ª
		String result = "";
		for (int i = record.length() - 1;i >= 0;i--) {
			result += record.charAt(i);
		}
		System.out.print(result);
	}

}
