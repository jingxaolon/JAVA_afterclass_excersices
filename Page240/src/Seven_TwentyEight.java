import java.util.Scanner;

public class Seven_TwentyEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int[] list1 = new int[10];
		
		System.out.print("Enter ten numbers£º");
		int i;
		for (i = 0;i < list1.length;i++) {
			list1[i] = input.nextInt();
		}
		
		for (i = 0;i < list1.length - 1;i++) {
			for (int j = i + 1;j < list1.length;j++) {
				System.out.println("(" + list1[i] + ", " + list1[j] + ")");
			}
		}
		
	}

}
