
public class Five_ThirtyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		int count;
		for (count = 2;count <= 10000;count++) {
			for (int i = 1;i < count;i++) {
				if (count % i == 0) {
					sum += i;
				}
			}
			if (sum == count)
				System.out.println(count);
			sum = 0;
		}
	}

}
