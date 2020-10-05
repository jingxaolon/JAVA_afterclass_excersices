
public class Seven_Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myList = {1, 2, 3, 4, 6};
		double[] myList2 = {1, 2, 3, 4, 6};
		
		System.out.println(average(myList));
		System.out.println(average(myList2));
	}

	public static int average(int[] array) {
		double sum = 0;
		for (int i = 0;i < array.length;i++) {
			sum += array[i];
		}
		
		return (int)(sum / array.length);
	}
	
	public static double average(double[] array) {
		double sum = 0;
		for (int i = 0;i < array.length;i++) {
			sum += array[i];
		}
		
		return sum / array.length;
	}
}
