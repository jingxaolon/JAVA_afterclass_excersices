
public class Seven_Sixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] hundredThousandList = new int[100000];
		int key = (int)(Math.random() * 10);
		
		/* fill the array */
		int i = 0;
		while (i < hundredThousandList.length) {
			hundredThousandList[i++] = (int)(Math.random() * 10);
		}
		
		/* record the time spent executing the LinearSearch function */
		long startTime = System.nanoTime();
		Seven_Five.LinearSearch(hundredThousandList, key);
		long endTime = System.nanoTime();
		long executionTime = endTime - startTime;
		
		System.out.println("Time spent executing the LinearSearch function: \n" + executionTime);
		
		/* sort the array */
		selectSort(hundredThousandList);
		
		/* record the time spent executing the binarySearch function */
		startTime = System.nanoTime();
		Seven_Five.binarySearch(hundredThousandList, key);
		endTime = System.nanoTime();
		executionTime = endTime - startTime;
		
		System.out.println("Time spent executing the binarySearch function: \n" + executionTime);
	}

	public static void selectSort(int[] array) {
		/* Select sort (book's way)*/
		for (int i = 0;i < array.length - 1;i++) {
			int currentMin = array[i];
			int currentIndex = i;
			
			for (int j = i + 1;j < array.length;j++) {
				if (currentMin > array[j]) {
					currentMin = array[j];
					currentIndex = j;
				}
			}
			
			if (currentIndex != i) {
				array[currentIndex] = array[i];
				array[i] = currentMin;
			}
		}
		/* Select sort (book's way)*/
	}
}
