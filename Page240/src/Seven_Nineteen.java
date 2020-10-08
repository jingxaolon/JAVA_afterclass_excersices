import java.util.Scanner;

public class Seven_Nineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int listSize = input.nextInt();
		
		System.out.print("Enter the contents of the list: ");
		int[] arrayList = new int[listSize];
		
		int i = 0;
		while (i < arrayList.length) {
			arrayList[i++] = input.nextInt();
		}
		
		System.out.print("The list has " + listSize + " integers ");
		for (i = 0;i < arrayList.length;i++) {
			System.out.print(arrayList[i] + " ");
		}
		System.out.print("\n");
		
		if (isSorted(arrayList)) {
			System.out.print("The list is already sorted\n");
		}
		else {
			System.out.print("The list is not sorted\n");
		}
	}

	public static boolean isSorted(int[] list) {
		for (int i = 0;i < list.length - 1;i++) {
			if (list[i] > list[i + 1]) {
				return false;
			}
		}
		
		return true;
	}
}
