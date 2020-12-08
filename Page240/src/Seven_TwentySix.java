import java.util.Scanner;

public class Seven_TwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int[] list1 = new int[100];
		int[] list2 = new int[100];
		
		System.out.print("Enter list1 size and contents£º");
		int list1Size = input.nextInt();
		int i;
		for (i = 0;i < list1Size;i++) {
			list1[i] = input.nextInt();
		}
		
		System.out.print("Enter list2 size and contents£º");
		int list2Size = input.nextInt();
		for (i = 0;i < list2Size;i++) {
			list2[i] = input.nextInt();
		}
		
		if (equals(list1, list2)) {
			System.out.print("Two lists are strictly identical");
		}
		else {
			System.out.print("Two lists are not strictly identical");
		}
	}

	public static boolean equals(int[] list1, int[] list2) {
		int count;
		for (count = 0;count < list1.length;count++) {
			if (list1[count] != list2[count]) {
				return false;
			}
		}
		
		return true;
	}
}
