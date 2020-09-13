import java.util.Scanner;

public class Five_FortySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		
		String temp1 = input.next();
		String temp2 = "";
		
		int i;
		for (i = temp1.length() - 1;i >= 0;i--) {
			temp2 += temp1.charAt(i);
		}
		System.out.print(temp2);
	}

}
