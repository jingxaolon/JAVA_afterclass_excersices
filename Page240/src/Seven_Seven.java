
public class Seven_Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] hundredList = new int[100];
		int[] recordList = new int[10];
		
		int count = 0;
		while (count < hundredList.length) {
			hundredList[count++] = (int)(Math.random() * 10);
		}
		
		/* print the random array*/
		System.out.print("The array generated: \n");
		for (count = 0;count < hundredList.length;count++) {
			System.out.print(hundredList[count] + "\t");
			if ((count + 1) % 10 == 0)
				System.out.print("\n");
		}

		for (int i = 0;i < hundredList.length;i++) {
			recordList[hundredList[i]]++;
		}
		
		/* print result */
		for (int j = 0;j < recordList.length;j++) {
			if (recordList[j] == 0) {
				continue;
			}
			
			if (recordList[j] > 1) {
				System.out.println(j + " occurs " + recordList[j] + " times");
			}
			else {
				System.out.println(j + " occurs " + recordList[j] + " time");
			}
		}
	}

}
