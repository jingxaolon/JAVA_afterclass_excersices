import java.util.Scanner;

public class Seven_Thirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values£º");
		int size = input.nextInt();
		int[] list1 = new int[size];
		
		System.out.print("Enter the values£º");
		int i;
		for (i = 0;i < list1.length;i++) {
			list1[i] = input.nextInt();
		}
		
		if (isConsecutiveFour(list1)) {
			System.out.println("The list has consecutive fours");
		}
		else {
			System.out.print("The list has no consecutive fours");
		}
	}

	public static boolean isConsecutiveFour(int[] values) {
		int i, count;
		for (i = 0;i < values.length;i++) {
			count = 0;
			for (int j = i;j < values.length && j < i + 4;j++) {
				if (values[i] == values[j]) {
					count++;
					continue;
				}
				else {
					break;
				}
			}
			
			if (count == 4) {
				return true;
			}
		}
		
		return false;
	}
}
