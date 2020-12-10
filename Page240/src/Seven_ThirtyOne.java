import java.util.Scanner;

public class Seven_ThirtyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter list1 size and contents£º");
		int size1 = input.nextInt();
		int[] list1 = new int[size1];
		int i;
		for (i = 0;i < list1.length;i++) {
			list1[i] = input.nextInt();
		}
		
		System.out.print("Enter list2 size and contents£º");
		int size2 = input.nextInt();
		int[] list2 = new int[size2];
		for (i = 0;i < list2.length;i++) {
			list2[i] = input.nextInt();
		}
		
		System.out.println("list1 is " + java.util.Arrays.toString(list1));
		System.out.println("list2 is " + java.util.Arrays.toString(list2));
		
		System.out.println("The merged list is " + java.util.Arrays.toString(merge(list1, list2)));
	}

	public static int[] merge(int[] list1, int[] list2) {
		int[] temp = new int[list1.length + list2.length];
		int i, convert = -1;
		
		//sort list1
		for (i = 0;i < list1.length - 1;i++) {
			for (int j = i;j < list1.length;j++) {
				if (list1[i] > list1[j]) {
					convert = list1[i];
					list1[i] = list1[j];
					list1[j] = convert;
				}
			}
		}
		
		//sort list2
		convert = -1;
		for (i = 0;i < list2.length - 1;i++) {
			for (int j = i;j < list2.length;j++) {
				if (list2[i] > list2[j]) {
					convert = list2[i];
					list2[i] = list2[j];
					list2[j] = convert;
				}
			}
		}
		
		//start merge
		int indexTemp = 0;
		int index1 = 0, index2 = 0;
		while (index1 < list1.length && index2 < list2.length) {
			if (list1[index1] < list2[index2]) {
				temp[indexTemp++] = list1[index1++];
			}
			else if (list1[index1] == list2[index2]) {
				temp[indexTemp++] = list1[index1++];
				temp[indexTemp++] = list2[index2++];
			}
			else {
				temp[indexTemp++] = list2[index2++];
			}
		}
		
		while (index1 < list1.length) {
			temp[indexTemp++] = list1[index1++];
		}
		
		while (index2 < list2.length) {
			temp[indexTemp++] = list2[index2++];
		}
		
		return temp;
	}
}
