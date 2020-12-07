
public class Seven_TwentyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int STUDENTNUM = 100;
		
		boolean[] locker = new boolean[STUDENTNUM];
		
		//the first student(S1) opens all the lockers.
		int i;
		for (i = 0;i < locker.length;i++) {
			locker[i] = true;
		}
		
		for (i = 1;i < locker.length;i++) {
			for (int j = i;j < locker.length;j = j + i + 1) {
				if (locker[j]) {
					locker[j] = false;
				}
				else {
					locker[j] = true;
				}
			}
		}
		
		//print result
		System.out.println("以下编号的柜子是打开的：");
		for (i = 0;i < locker.length;i++) {
			if (locker[i]) {
				System.out.printf("%d ", i + 1);
			}
		}
	}

}
