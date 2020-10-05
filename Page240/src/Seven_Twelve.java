import java.util.Scanner;

public class Seven_Twelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int[] tenArray = new int[10];
		
		int i = 0;
		while (i < tenArray.length) {
			tenArray[i++] = input.nextInt();
		}
		
		int[] newArray = reverse(tenArray);
		for (int j = 0;j < newArray.length;j++) {
			System.out.print(newArray[j] + " ");
		}
	}

	public static int[] reverse(int[] list) {
		int left = 0;
		int right = list.length - 1;
		int temp = 0;
		
		for (;left <= right;left++, right--) {
			temp = list[left];
			list[left] = list[right];
			list[right] = temp;
		}
		
		return list;
	}
}
