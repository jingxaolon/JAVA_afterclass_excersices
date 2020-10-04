import java.util.Scanner;

public class Seven_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		
		int[] myList = new int[100];

		/* get input */
		myList[0] = input.nextInt();
		
		int i = 0;
		while (myList[i] != 0) {
			if (i > 99)
				break;
			
			myList[++i] = input.nextInt();
		}
		
		/* get appearance times */
		int[] appearanceList = new int[100];
		
		for (int k = 0;k < i;k++) {
			appearanceList[myList[k] - 1]++;
			
			//System.out.print(myList[k] + " ");
		}
		
		/* print result */
		for (int j = 0;j < appearanceList.length;j++) {
			if (appearanceList[j] == 0) {
				continue;
			}
			
			if (appearanceList[j] > 1) {
				System.out.println((j + 1) + " occurs " + appearanceList[j] + " times");
			}
			else {
				System.out.println((j + 1) + " occurs " + appearanceList[j] + " time");
			}
		}		
	}

}
