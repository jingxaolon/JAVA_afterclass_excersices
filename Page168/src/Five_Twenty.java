
public class Five_Twenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count;
		int num = 0;
		for (count = 2;count <= 1000;count++) {
			
			int i;
			for (i = 2;i < count;i++) {
				if (count % i == 0) {
					break;
				}
			}
			if (i >= count) {
				num++;
				System.out.print(count + " ");
				if (num % 8 == 0)
					System.out.println();
			}
		}
	}

}
