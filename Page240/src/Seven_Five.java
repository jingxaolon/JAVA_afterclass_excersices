import java.util.Scanner;

public class Seven_Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		
		int[] tenList = new int[10];
		int temp = 0;
		int ret = 0;
		int countNumber = 0;
		int internelcount = 0;
		
		int i;
		for (i = 0;i < tenList.length;i++) {
			temp = input.nextInt();
			
			ret = LinearSearch(tenList, temp);
			if (ret == -1) {
				tenList[internelcount++] = temp;
				countNumber++;
			}
			else {
				continue;
			}
		}
		
		System.out.println("The number of distinct numbers is " + countNumber);
		
		System.out.print("The distinct numbers are: ");
		for (int j = 0;j < countNumber;j++) {
			System.out.print(tenList[j] + " ");
		}
	}
	
	public static int LinearSearch(int[] array, int key) {
		for (int i = 0;i < array.length;i++) {
			if (key == array[i])
				return i;
		}
		return -1;	//not found
	}
	
	public static int binarySearch(int[] array, int key) {
		int low = 0, high = array.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			
			if (key < array[mid]) {
				high = mid - 1;
			}
			else if (key == array[mid]) {
				return mid;
			}
			else {
				low = mid + 1;
			}
		}

		return -low - 1;	//not found
	}

}
