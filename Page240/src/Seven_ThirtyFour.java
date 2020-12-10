import java.util.Scanner;

public class Seven_ThirtyFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Enter a string: ");
		 String s = input.next();
		 
		 System.out.println(sort(s));
	}

	public static String sort(String s) {
		char[] tmp = new char[s.length()];
		char swap = '0';
		
		int i;
		for (i = 0;i < s.length();i++) {
			tmp[i] = s.charAt(i);
		}
		
		for (i = 0;i < s.length() - 1;i++) {
			for (int j = i + 1;j < s.length();j++) {
				if (tmp[i] > tmp[j]) {
					swap = tmp[i];
					tmp[i] = tmp[j];
					tmp[j] = swap;
				}
			}
		}
		
		return java.util.Arrays.toString(tmp);
	}
}
