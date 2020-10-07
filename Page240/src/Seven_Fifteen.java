import java.util.Scanner;

public class Seven_Fifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int[] tenArray = new int[10];
		
		int i = 0;
		while (i < tenArray.length) {
			tenArray[i++] = input.nextInt();
		}
		
		int[] resultList = eliminateDuplicates(tenArray);
		
		System.out.print("The distinct numbers are: ");
		i = 0;
		while (i < resultList.length) {
			if (resultList[i] != 0) {
				System.out.print(resultList[i++] + " ");
			}
		}
	}

	public static int[] eliminateDuplicates(int[] list) {
		int[] resultList = new int[10];
		int ret = 0;
		int recordForResult = 0;
		
		for (int i = 0;i < list.length;i++) {
			ret = LinearSearchReturnSearchedTimes(list, list[i]);
			if (ret > 1) {
				/* If the number of occurrences is greater than 1, 
				 * first judge whether it is already in the result array, 
				 * if it is not, record it, if it is, don¡¯t record it */
				int tempRecord = LinearSearchReturnSearchedTimes(resultList, list[i]);
				if (tempRecord == -1) {
					resultList[recordForResult++] = list[i];
				}
			}
			else {
				resultList[recordForResult++] = list[i];
			}
		}
		
		return resultList;
	}
	
	public static int LinearSearchReturnSearchedTimes(int[] array, int key) {
		int timesSearched = 0;
		
		for (int i = 0;i < array.length;i++) {
			if (key == array[i])
				timesSearched++;
		}
		
		if (timesSearched == 0) {
			return -1;	//not found
		}
		
		return timesSearched;	//Returns the number of times this number was found
	}
}
