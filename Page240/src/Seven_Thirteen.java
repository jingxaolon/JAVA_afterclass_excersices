
public class Seven_Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("The array list is: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10\n");
		int getNumber = getRandom(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println("The random number between 1 and 54 is: " + getNumber);
	}

	public static int getRandom(int... numbers) {
		int randomNumber = (int)(Math.random() * 54 + 1);
		
		while (Seven_Five.LinearSearch(numbers, randomNumber) != -1) {
			randomNumber = (int)(Math.random() * 54 + 1);
		}
		
		return randomNumber;
	}
	
	/* backup */
	public static int LinearSearch(int[] array, int key) {
		for (int i = 0;i < array.length;i++) {
			if (key == array[i])
				return i;
		}
		return -1;	//not found
	}
}
